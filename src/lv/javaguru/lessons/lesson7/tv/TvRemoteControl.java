package lv.javaguru.lessons.lesson7.tv;

/**
 * Created by olegssedacs on 16/07/2017.
 */
public class TvRemoteControl {

    private TV tv;

    public void connect(TV tv) {
        this.tv = tv;
    }

    public void switchOn() {
        if (tv != null) {
            tv.powerOn();
        } else {
            System.out.println("Not connected to tv");
        }
    }

    public void switchOff() {
        if (tv != null) {
            tv.powerOff();
        } else {
            System.out.println("Not connected to tv");
        }
    }

    public void channelUp() {
        if (tv != null) {
            tv.channelUp();
        } else {
            System.out.println("Not connected to tv");
        }
    }

    public void channelDown() {
        if (tv != null) {
            tv.channelDown();
        } else {
            System.out.println("Not connected to tv");
        }
    }

}
