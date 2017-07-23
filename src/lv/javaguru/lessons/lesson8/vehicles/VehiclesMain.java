package lv.javaguru.lessons.lesson8.vehicles;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class VehiclesMain {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Aircraft();
        vehicles[1] = new Bike();
        vehicles[2] = new Car();

        for (Vehicle v : vehicles) {
            System.out.println(v.getMaximumSpeed());
            v.move();
            v.stop();
            System.out.println("---------------");
        }
    }

}
