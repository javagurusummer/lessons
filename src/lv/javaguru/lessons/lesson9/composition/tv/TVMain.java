package lv.javaguru.lessons.lesson9.composition.tv;

/**
 * Created by olegssedacs on 16/07/2017.
 */
public class TVMain {

    public static void main(String[] args) {
        TV tv = new TV("Samsung X-34532", 4);
        ExtendedTvRemoteControl control = new ExtendedTvRemoteControl();
        control.channelDown();
        control.channelUp();

        control.connect(tv);

        control.switchOn();
        control.channelUp();

        control.switchChannel(4);

        control.switchOff();
        control.channelDown();


        System.out.println(tv);
    }

}
