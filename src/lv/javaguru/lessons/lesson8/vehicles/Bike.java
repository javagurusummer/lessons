package lv.javaguru.lessons.lesson8.vehicles;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class Bike implements Vehicle {

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }

    @Override
    public int getMaximumSpeed() {
        return 300;
    }

    @Override
    public void stop() {
        System.out.println("Bike stop");
    }
}
