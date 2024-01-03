package model;

public class NullObject implements Vehicle{
    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public int getGear() {
        return 0;
    }
}
