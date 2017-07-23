package lv.javaguru.lessons.lesson8.vehicles;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class Aircraft implements Vehicle {

    @Override
    public void move() {
        System.out.println("Aircraft is flying");
    }

    @Override
    public int getMaximumSpeed() {
        return 900;
    }

}
