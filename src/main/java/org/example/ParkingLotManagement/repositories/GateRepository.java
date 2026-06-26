package org.example.ParkingLotManagement.repositories;

import org.example.ParkingLotManagement.models.Gate;

import java.util.Optional;
import java.util.TreeMap;

//In-memory DB - We will use a datastructure to mock a DB
public class GateRepository {
    TreeMap<Long, Gate> GateTable = new TreeMap<>();
    private Long id = 0l;

    public Gate save(Gate gate) {
        gate.setId(id++);
        GateTable.put(gate.getId(), gate); // Query - "insert *,* ..."
        return gate;
    }
     public Optional<Gate> getGateById(Long gateId){
        return Optional.of(GateTable.get(gateId)); // Query - "select * from GateTable where id=``"
     }
    // public List<Gate> getGateByType(GateType type)
    // public Gate getGateByNumber(Integer gateNo)
}
// HashMap - { PrimaryKey - GateObject }
// TreeMap - Is a sorted by key hashmap