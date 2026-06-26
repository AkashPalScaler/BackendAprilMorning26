package org.example.ParkingLotManagement.DTOs;

import org.example.ParkingLotManagement.models.ResponseStatus;

import java.util.Date;

public class CreateTicketResponseDTO {
    private ResponseStatus responseStatus;
    private String message;
    private String ticketNumber;
    private String vehicleNumber;
    private Date entryTime;
    private String slotNumber;

    public CreateTicketResponseDTO(ResponseStatus responseStatus, String message) {
        this.responseStatus = responseStatus;
        this.message = message;
    }

    public CreateTicketResponseDTO() {
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }
}
