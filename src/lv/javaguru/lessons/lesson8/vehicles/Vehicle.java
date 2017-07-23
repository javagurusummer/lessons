package lv.javaguru.lessons.lesson8.vehicles;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public interface Vehicle {

    void move();

    int getMaximumSpeed();

    default void stop() {
        System.out.println("stop");
    }
}
