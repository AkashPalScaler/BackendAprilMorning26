package org.example.ParkingLotManagement.repositories;

import org.example.ParkingLotManagement.models.Vehicle;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {
    private TreeMap<String, Vehicle> VehicleTable = new TreeMap<>();
    private Long id = 0l;

    public Vehicle save(Vehicle vehicle){
//        System.out.println("VehicleRepository save - " + vehicle);
        vehicle.setId(id++);
        VehicleTable.put(vehicle.getReg_number(), vehicle);
        return vehicle;
    }


    public Optional<Vehicle> findByRegistrationNumber(String registrationNumber){
        return Optional.ofNullable(VehicleTable.get(registrationNumber));
    }

    public Vehicle findOrCreate(Vehicle vehicle){
        System.out.println("Vehicle regNo : " + vehicle.getReg_number());
        Optional<Vehicle> optionalVehicle = findByRegistrationNumber(vehicle.getReg_number());
        if (optionalVehicle.isPresent()){
            System.out.println("Vehicle exists in database");
            return optionalVehicle.get();
        }
        return save(vehicle);
    }
}
