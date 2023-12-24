package org.aditya.withStrategyPattern;

import org.aditya.withStrategyPattern.Strategy.DriveStrategy;
import org.aditya.withStrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{

    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
