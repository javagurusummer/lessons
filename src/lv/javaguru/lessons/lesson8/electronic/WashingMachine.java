package lv.javaguru.lessons.lesson8.electronic;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class WashingMachine implements Electronic {

    @Override
    public void on() {
        System.out.println("WashingMachine is turned on");
    }

    @Override
    public void off() {
        System.out.println("WashingMachine is turned off");
    }
}
