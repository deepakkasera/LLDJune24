package org.example.parkinglot.repositories;

import org.example.parkinglot.models.ParkingLot;

import java.util.Optional;

public class ParkingLotRepository {

    public Optional<ParkingLot> findByGateId(Long gateId) {
        return Optional.empty();
    }
}
