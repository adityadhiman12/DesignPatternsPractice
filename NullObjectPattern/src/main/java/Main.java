import model.Car;
import model.NullObject;
import model.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new NullObject();
        System.out.println(car.getSpeed());
        System.out.println(car.getGear());

    }
}
