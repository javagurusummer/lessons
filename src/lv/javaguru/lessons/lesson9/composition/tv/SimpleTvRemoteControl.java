package lv.javaguru.lessons.lesson9.composition.tv;

/**
 * Created by olegssedacs on 16/07/2017.
 */
public class SimpleTvRemoteControl implements TvRemoteControl {

    private TV tv;

    @Override
    public void connect(TV tv) {
        this.tv = tv;
    }

    @Override
    public void switchOn() {
        if (tv != null) {
            tv.powerOn();
        } else {
            System.out.println("Not connected to tv");
        }
    }

    @Override
    public void switchOff() {
        if (tv != null) {
            tv.powerOff();
        } else {
            System.out.println("Not connected to tv");
        }
    }

    @Override
    public void channelUp() {
        if (tv != null) {
            tv.channelUp();
        } else {
            System.out.println("Not connected to tv");
        }
    }

    @Override
    public void channelDown() {
        if (tv != null) {
            tv.channelDown();
        } else {
            System.out.println("Not connected to tv");
        }
    }

}
