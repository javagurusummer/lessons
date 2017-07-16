package lv.javaguru.lessons.lesson7.tv;

/**
 * Created by olegssedacs on 16/07/2017.
 */
public class TV {

    private int channels;
    private int currentChannel;
    private boolean powered;
    private String model;

    public TV(String model, int channels) {
        this.model = model;
        this.channels = channels;
    }

    public void powerOn() {
        powered = true;
        System.out.println("Tv ON, current channel : " + currentChannel);
    }

    public void powerOff() {
        powered = false;
        System.out.println("Tv OFF");
    }

    public boolean isPowered() {
        return powered;
    }

    public void channelUp() {
        if (!isPowered()) {
            return;
        }
        if (currentChannel < channels) {
            currentChannel++;
        } else {
            currentChannel = 0;
        }
        onSwitch();

    }

    public void channelDown() {
        if (!isPowered()) {
            return;
        }
        if (currentChannel > 0) {
            currentChannel--;
        } else {
            currentChannel = channels;
        }
        onSwitch();
    }

    private void onSwitch() {
        System.out.println("Channel switched : " + currentChannel);
    }

    @Override
    public String toString() {
        return "Model : " + model + ", channels : " + channels;
    }


}
