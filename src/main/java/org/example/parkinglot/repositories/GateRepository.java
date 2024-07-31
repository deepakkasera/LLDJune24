package org.example.parkinglot.repositories;

import org.example.parkinglot.models.Gate;

import java.util.Optional;

public class GateRepository {
    //In memory DB
    public Optional<Gate> findGateById(Long gateId) {
        return Optional.empty();
    }
}
