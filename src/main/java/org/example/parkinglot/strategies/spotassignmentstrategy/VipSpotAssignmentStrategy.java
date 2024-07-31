package org.example.parkinglot.strategies.spotassignmentstrategy;

import org.example.parkinglot.models.Gate;
import org.example.parkinglot.models.ParkingSpot;
import org.example.parkinglot.models.VehicleType;

public class VipSpotAssignmentStrategy implements SpotAssignmentStrategy {
    @Override
    public ParkingSpot assignSpot(Gate gate, VehicleType vehicleType) {
        return null;
    }
}
