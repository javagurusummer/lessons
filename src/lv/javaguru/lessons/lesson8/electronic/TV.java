package lv.javaguru.lessons.lesson8.electronic;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class TV implements Electronic {

    private boolean powerOn;

    @Override
    public void on() {
        this.powerOn = true;
        System.out.println("TV is turned on");
    }

    @Override
    public void off() {
        this.powerOn = false;
        System.out.println("TV is turned off");
    }

    public void switchChannel() {
        System.out.println("Channel switched");
    }
}
