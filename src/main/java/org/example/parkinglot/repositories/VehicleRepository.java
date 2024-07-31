package org.example.parkinglot.repositories;

import org.example.parkinglot.models.Vehicle;

import java.util.Optional;

public class VehicleRepository {

    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber) {
        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle) {
        return null;
    }
}
