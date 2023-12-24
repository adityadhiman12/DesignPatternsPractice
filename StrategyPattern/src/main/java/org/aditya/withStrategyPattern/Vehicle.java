package org.aditya.withStrategyPattern;

import org.aditya.withStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy obj;
    Vehicle(DriveStrategy obj) {
        this.obj=obj;
    }
    public void drive() {
        obj.drive();
    }
}
