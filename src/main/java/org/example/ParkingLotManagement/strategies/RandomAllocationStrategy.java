package org.example.ParkingLotManagement.strategies;

import org.example.ParkingLotManagement.models.*;

import javax.swing.text.html.Option;
import java.util.Optional;

public class RandomAllocationStrategy implements SlotAllocationStrategy {
    @Override
    public Optional<ParkingSlot> allocateSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        // TODO: Slot allocation logic
        for(ParkingFloor floor : parkingLot.getFloors()){
            for(ParkingSlot slot : floor.getParkingSlots()){
                if(slot.getStatus().equals(ParkingSlotStatus.EMPTY)){
                    for(AllowedVehicle allowedVehicle: slot.getAllowedVehicles()){
                        if(allowedVehicle.getType().equals(vehicleType)){
                            return Optional.of(slot);
                        }
                    }
                }
            }
        }
        return Optional.empty();
    }
}
