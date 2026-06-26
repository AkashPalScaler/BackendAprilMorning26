package org.example.ParkingLotManagement.DTOs;

import org.example.ParkingLotManagement.models.Vehicle;
import org.example.ParkingLotManagement.models.VehicleType;

public class CreateTicketRequestDTO {
    Long GateId;
    String vehicleNumber;
    String ownerName;
    String ownerNumber;
    VehicleType vehicleType;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public CreateTicketRequestDTO(Long gateId, String vehicleNumber, String ownerName, String ownerNumber, VehicleType vehicleType) {
        GateId = gateId;
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.ownerNumber = ownerNumber;
        this.vehicleType = vehicleType;
    }

    public CreateTicketRequestDTO() {
    }

    public Long getGateId() {
        return GateId;
    }

    public void setGateId(Long gateId) {
        GateId = gateId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(String ownerNumber) {
        this.ownerNumber = ownerNumber;
    }
}
