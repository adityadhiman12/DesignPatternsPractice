package org.aditya.withStrategyPattern;

import org.aditya.withStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super( new SportsDriveStrategy());
    }
}
