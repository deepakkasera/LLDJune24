package org.example.parkinglot.strategies.spotassignmentstrategy;

import org.example.parkinglot.models.Gate;
import org.example.parkinglot.models.ParkingSpot;
import org.example.parkinglot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(Gate gate, VehicleType vehicleType);
}
