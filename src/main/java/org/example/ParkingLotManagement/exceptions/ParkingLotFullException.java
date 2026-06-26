package org.example.ParkingLotManagement.exceptions;

public class ParkingLotFullException extends  RuntimeException {
    public ParkingLotFullException(String message) {
        super(message);
    }
}
