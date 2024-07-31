package org.example.parkinglot.factories;

import org.example.parkinglot.models.ParkingSpotAssignmentStrategyType;
import org.example.parkinglot.strategies.spotassignmentstrategy.NearestSpotAssignmentStrategy;
import org.example.parkinglot.strategies.spotassignmentstrategy.RandomSpotAssignmentStrategy;
import org.example.parkinglot.strategies.spotassignmentstrategy.SpotAssignmentStrategy;
import org.example.parkinglot.strategies.spotassignmentstrategy.VipSpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategy(
            ParkingSpotAssignmentStrategyType parkingSpotAssignmentStrategyType) {
        if (parkingSpotAssignmentStrategyType.equals(ParkingSpotAssignmentStrategyType.NEAREST)) {
            return new NearestSpotAssignmentStrategy();
        } else if (parkingSpotAssignmentStrategyType.equals(ParkingSpotAssignmentStrategyType.VIP)) {
            return new VipSpotAssignmentStrategy();
        } else if (parkingSpotAssignmentStrategyType.equals(ParkingSpotAssignmentStrategyType.RANDOM)) {
            return new RandomSpotAssignmentStrategy();
        }

        return null;
    }
}
