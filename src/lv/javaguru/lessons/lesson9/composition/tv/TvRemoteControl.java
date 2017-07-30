package lv.javaguru.lessons.lesson9.composition.tv;

/**
 * Created by javastar on 7/30/2017.
 */
public interface TvRemoteControl {

    void connect(TV tv);

    void switchOn();

    void switchOff();

    void channelUp();

    void channelDown();

}
