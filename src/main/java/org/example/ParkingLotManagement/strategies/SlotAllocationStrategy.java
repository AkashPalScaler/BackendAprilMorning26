package org.example.ParkingLotManagement.strategies;

import org.example.ParkingLotManagement.models.ParkingLot;
import org.example.ParkingLotManagement.models.ParkingSlot;
import org.example.ParkingLotManagement.models.VehicleType;

import java.util.Optional;

public interface SlotAllocationStrategy {
    Optional<ParkingSlot> allocateSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
