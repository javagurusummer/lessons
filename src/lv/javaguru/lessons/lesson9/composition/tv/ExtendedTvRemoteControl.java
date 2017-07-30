package lv.javaguru.lessons.lesson9.composition.tv;

/**
 * Created by javastar on 7/30/2017.
 */
public class ExtendedTvRemoteControl implements TvRemoteControl {

    private TV tv;

    private SimpleTvRemoteControl simpleTvRemoteControl;

    public ExtendedTvRemoteControl() {
        this.simpleTvRemoteControl = new SimpleTvRemoteControl();
    }

    @Override
    public void connect(TV tv) {
        this.tv = tv;
        simpleTvRemoteControl.connect(tv);
    }

    @Override
    public void switchOn() {
        simpleTvRemoteControl.switchOn();
    }

    @Override
    public void switchOff() {
        simpleTvRemoteControl.switchOff();
    }

    @Override
    public void channelUp() {
        simpleTvRemoteControl.channelUp();
    }

    @Override
    public void channelDown() {
        simpleTvRemoteControl.channelDown();
    }

    public void switchChannel(int channel) {
        if (tv != null) {
            tv.switchChannel(channel);
        } else {
            System.out.println("Not connected to tv");
        }
    }

}
