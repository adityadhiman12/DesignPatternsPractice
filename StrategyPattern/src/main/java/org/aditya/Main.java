package org.aditya;

import org.aditya.withStrategyPattern.NormalVehicle;
import org.aditya.withStrategyPattern.OffRoadVehicle;
import org.aditya.withStrategyPattern.SportsVehicle;
import org.aditya.withStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        Vehicle vehicle2 = new OffRoadVehicle();
        Vehicle vehicle3 = new NormalVehicle();
        vehicle.drive();
        vehicle2.drive();
        vehicle3.drive();
    }
}