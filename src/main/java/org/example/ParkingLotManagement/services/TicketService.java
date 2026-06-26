package org.example.ParkingLotManagement.services;

import org.example.ParkingLotManagement.controllers.TicketController;
import org.example.ParkingLotManagement.exceptions.ParkingLotFullException;
import org.example.ParkingLotManagement.models.*;
import org.example.ParkingLotManagement.repositories.GateRepository;
import org.example.ParkingLotManagement.repositories.ParkingLotRepository;
import org.example.ParkingLotManagement.repositories.VehicleRepository;
import org.example.ParkingLotManagement.strategies.SlotAllocationStrategy;
import org.example.ParkingLotManagement.strategies.SlotAllocationStrategyFactory;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.Optional;

public class TicketService {
    GateRepository  gateRepository;
    VehicleRepository vehicleRepository;
    ParkingLotRepository parkingLotRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket createTicket(Long GateId, String vehicleNumber, String ownerName, String ownerNumber, VehicleType vehicleType){
        // TODO: Main business logic of ticket creation
        Optional<Gate> optionalGate = gateRepository.getGateById(GateId);
        if(optionalGate.isEmpty()){
            throw new IllegalArgumentException("Gate not found");
        }
        Gate gate =  optionalGate.get();
        Operator operator = gate.getOperator();

        Vehicle vehicle = new Vehicle(vehicleNumber, ownerName, ownerNumber, vehicleType);
        vehicle = vehicleRepository.findOrCreate(vehicle);

        Ticket  ticket = new Ticket();
        ticket.setGate(gate);
        ticket.setOperator(operator);
        ticket.setVehicle(vehicle);
        ticket.setEntry_time(new Date());

        ParkingLot parkingLot = gate.getParkingLot();
        SlotAllocationStrategy slotAllocationStrategy =
                SlotAllocationStrategyFactory.getStrategy(parkingLot.getSlot_allocation_type());

        Optional<ParkingSlot> optionalParkingSlot = slotAllocationStrategy.allocateSlot(parkingLot, vehicleType);
        if(optionalParkingSlot.isEmpty()){
            throw new ParkingLotFullException("Slot not found");
        }
        ParkingSlot parkingSlot = optionalParkingSlot.get();
        ticket.setParkingSlot(parkingSlot);
        parkingSlot.setStatus(ParkingSlotStatus.FILLED);

        return ticket;
    }
}
// Generate Ticket
// 1. Request Input - Vehicle Details, GateId
// 2. Fetch the Gate and operator
// 3. Find-Or-Create the vehicle
// 4. We need to create a ticket with all the details like - current time, Gate, Op, vehicle
// 5. We need to find a slot according to the slot allocation algo
// 6. Set the slot/floor on the ticket
// 7. Return the response - TicketNumber, CurrentTime, SlotNo, VehicleNo


