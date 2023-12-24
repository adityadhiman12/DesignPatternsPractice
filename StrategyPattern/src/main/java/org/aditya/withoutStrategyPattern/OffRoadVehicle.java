package org.aditya.withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{

    //different drive capability
    @Override
    public void drive() {
        System.out.println("sports vehicle driving capability");
    }
}
