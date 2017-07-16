package lv.javaguru.lessons.lesson7.tv;

/**
 * Created by olegssedacs on 16/07/2017.
 */
public class TVMain {

    public static void main(String[] args) {
        TV tv = new TV("Samsung X-34532", 4);
        TvRemoteControl control = new TvRemoteControl();
        control.channelDown();
        control.channelUp();

        control.connect(tv);

        control.switchOn();
        control.channelUp();

        control.switchOff();
        control.channelDown();

        System.out.println(tv);
    }

}
