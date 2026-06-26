package org.example.ParkingLotManagement.controllers;

import org.example.ParkingLotManagement.DTOs.CreateTicketRequestDTO;
import org.example.ParkingLotManagement.DTOs.CreateTicketResponseDTO;
import org.example.ParkingLotManagement.models.ResponseStatus;
import org.example.ParkingLotManagement.models.Ticket;
import org.example.ParkingLotManagement.services.TicketService;

public class TicketController {
    TicketService ticketService;
    //Dependency injection
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public CreateTicketResponseDTO createTicket(CreateTicketRequestDTO requestDTO){
        CreateTicketResponseDTO responseDTO = new CreateTicketResponseDTO();
        try{
            // Format Input
            // Call the service class
            Ticket ticket = ticketService.createTicket(
                    requestDTO.getGateId(),
                    requestDTO.getVehicleNumber(),
                    requestDTO.getOwnerName(),
                    requestDTO.getOwnerNumber(),
                    requestDTO.getVehicleType());

            // Format the output/error
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            responseDTO.setMessage("Ticket created successfully");
            responseDTO.setTicketNumber(ticket.getNumber());
            responseDTO.setEntryTime(ticket.getEntry_time());
            responseDTO.setSlotNumber(ticket.getParkingSlot().getNumber());
            responseDTO.setVehicleNumber(ticket.getVehicle().getReg_number());

        }catch (Exception e){
            System.out.println("Error in creating ticket - " + e.getMessage());
            e.printStackTrace();
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
            responseDTO.setMessage("Error in creating ticket - " + e.getMessage());
            return responseDTO;
        }
        return responseDTO;
    }
    //Break till 8:07AM
}

// Generate Ticket
// 1. Request Input - Vehicle Details, GateId
// 2. Fetch the Gate and operator
// 3. Find-Or-Create the vehicle
// 4. We need to create a ticket with all the details like - current time, Gate, Op, vehicle
// 5. We need to find a slot according to the slot allocation algo
// 6. Set the slot/floor on the ticket
// 7. Return the response - TicketNumber, CurrentTime, SlotNo, VehicleNo

// Bill Generation-