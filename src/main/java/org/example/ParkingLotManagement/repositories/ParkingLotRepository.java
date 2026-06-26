package org.example.ParkingLotManagement.repositories;

import org.example.ParkingLotManagement.models.ParkingLot;
import org.example.ParkingLotManagement.models.ParkingLotStatus;
import org.example.ParkingLotManagement.models.ParkingSlot;

import java.util.TreeMap;

public class ParkingLotRepository {
    TreeMap<Long, ParkingLot> parkingLots = new TreeMap<>();
    Long id = 0l;

    public ParkingLot save(ParkingLot parkingLot) {
        parkingLot.setId(id++);
        parkingLots.put(parkingLot.getId(), parkingLot);
        return parkingLot;
    }
}
