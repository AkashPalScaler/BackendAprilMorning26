package org.example.ParkingLotManagement;

import org.example.ParkingLotManagement.DTOs.CreateTicketRequestDTO;
import org.example.ParkingLotManagement.DTOs.CreateTicketResponseDTO;
import org.example.ParkingLotManagement.controllers.TicketController;
import org.example.ParkingLotManagement.models.*;
import org.example.ParkingLotManagement.repositories.GateRepository;
import org.example.ParkingLotManagement.repositories.ParkingLotRepository;
import org.example.ParkingLotManagement.repositories.VehicleRepository;
import org.example.ParkingLotManagement.services.TicketService;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository);
        TicketController ticketController = new TicketController(ticketService);
        // Generate some pre data
        // Some gates, a parking lot, a parking, some parking slots
        Operator operator = new Operator("Akash", "NT155");
        Gate gateEntry1 = new Gate(12, GateType.ENTRY, GateStatus.OPEN, operator);
        Gate gateEntry2 = new Gate(13, GateType.ENTRY, GateStatus.OPEN, operator);
        Gate gateExit1 = new Gate(14, GateType.ENTRY, GateStatus.OPEN, operator);
        Gate gateExit2 = new Gate(15, GateType.ENTRY, GateStatus.OPEN, operator);

        ParkingLot parkingLot = new ParkingLot("Lodha Amara A");
        parkingLot.setStatus(ParkingLotStatus.EMPTY);
        gateEntry1.setParkingLot(parkingLot);
        gateEntry2.setParkingLot(parkingLot);
        gateExit1.setParkingLot(parkingLot);
        gateExit2.setParkingLot(parkingLot);


        //Entry gates
        List<Gate> entrygates = new ArrayList<>();
        entrygates.add(gateEntry1);
        entrygates.add(gateEntry2);
        parkingLot.setEntry_gates(entrygates);

        //Exit gates
        List<Gate> exitGates = new ArrayList<>();
        exitGates.add(gateExit1);
        exitGates.add(gateExit2);
        parkingLot.setExit_gates(exitGates);

        //Allocation strategy type
        parkingLot.setSlot_allocation_type(SlotAllocationType.RANDOM);

//        parkingLot.setSupportedVehicleTypes(null);
//        parkingLot.setId(1234123L);


        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setFloor_number(1);
        parkingFloor.setStatus(FloorStatus.OPEN);

        List<ParkingSlot> parkingSlots = new ArrayList<>();
        List<AllowedVehicle> av1List = new ArrayList<>();
        av1List.add(new AllowedVehicle(VehicleType.BIKE, 3));
        av1List.add(new AllowedVehicle(VehicleType.CAR, 1));
        List<AllowedVehicle> av2List = new ArrayList<>();
        av2List.add(new AllowedVehicle(VehicleType.CAR, 1));
        List<AllowedVehicle> av3List = new ArrayList<>();
        av3List.add(new AllowedVehicle(VehicleType.BIKE, 1));
        List<AllowedVehicle> av4List = new ArrayList<>();
        av4List.add(new AllowedVehicle(VehicleType.BIKE, 1));


        parkingSlots.add(new ParkingSlot("1", ParkingSlotStatus.EMPTY, av1List));
        parkingSlots.add(new ParkingSlot("2", ParkingSlotStatus.EMPTY, av2List));
        parkingSlots.add(new ParkingSlot("3", ParkingSlotStatus.EMPTY, av3List));
        parkingSlots.add(new ParkingSlot("4", ParkingSlotStatus.EMPTY, av4List));
        parkingFloor.setParkingSlots(parkingSlots);

        List<ParkingFloor> parkingFloorList = new ArrayList<>();
        parkingFloorList.add(parkingFloor);

        parkingLot.setFloors(parkingFloorList);
        gateEntry1.setParkingLot(parkingLot);
        gateEntry2.setParkingLot(parkingLot);
        gateExit1.setParkingLot(parkingLot);
        gateExit2.setParkingLot(parkingLot);

        gateRepository.save(gateEntry1);
        gateRepository.save(gateEntry2);
        gateRepository.save(gateExit1);
        gateRepository.save(gateExit2);

        parkingLotRepository.save(parkingLot);

        CreateTicketRequestDTO requestDTO = new CreateTicketRequestDTO();
        requestDTO.setGateId(1l);
        requestDTO.setOwnerName("Sam");
        requestDTO.setOwnerNumber("0000000000");
        requestDTO.setVehicleNumber("MA12566788");
        requestDTO.setVehicleType(VehicleType.CAR);

        CreateTicketResponseDTO responseDTO = ticketController.createTicket(requestDTO);

        if (responseDTO.getResponseStatus().equals(ResponseStatus.SUCCESS)) {
            System.out.println(responseDTO.getMessage());
            System.out.println("Ticket : " + responseDTO.getTicketNumber() + " at slot :" + responseDTO.getSlotNumber());
        } else {
            System.out.println(responseDTO.getMessage());
        }

        CreateTicketRequestDTO requestDTO2 = new CreateTicketRequestDTO();
        requestDTO2.setGateId(1l);
        requestDTO2.setOwnerName("Sami");
        requestDTO2.setOwnerNumber("0000000000");
        requestDTO2.setVehicleNumber("MA12566789");
        requestDTO2.setVehicleType(VehicleType.CAR);

        responseDTO = ticketController.createTicket(requestDTO2);

        if (responseDTO.getResponseStatus().equals(ResponseStatus.SUCCESS)) {
            System.out.println(responseDTO.getMessage());
            System.out.println("Ticket : " + responseDTO.getTicketNumber() + " at slot :" + responseDTO.getSlotNumber());
        } else {
            System.out.println(responseDTO.getMessage());
//        }
        }
    }
}
