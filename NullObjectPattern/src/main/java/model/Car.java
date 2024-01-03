package model;

public class Car implements Vehicle{
    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public int getGear() {
        return 2;
    }
}
