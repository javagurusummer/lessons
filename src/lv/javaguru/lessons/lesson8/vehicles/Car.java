package lv.javaguru.lessons.lesson8.vehicles;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public int getMaximumSpeed() {
        return 250;
    }

}
