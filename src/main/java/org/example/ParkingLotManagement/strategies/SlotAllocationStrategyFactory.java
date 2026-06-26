package org.example.ParkingLotManagement.strategies;

import org.example.ParkingLotManagement.models.SlotAllocationType;
import org.example.ParkingLotManagement.models.VehicleType;

public class SlotAllocationStrategyFactory {
    public static SlotAllocationStrategy getStrategy(SlotAllocationType slotAllocationType) {
        if(slotAllocationType.equals(SlotAllocationType.RANDOM)){
            return new RandomAllocationStrategy();
        }else{
            throw new IllegalArgumentException("Invalid slotAllocationType");
        }
    }
}
