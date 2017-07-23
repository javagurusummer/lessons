package lv.javaguru.lessons.lesson8.electronic;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class ElectronicMain {

    public static void main(String[] args) {
        Electronic[] array = new Electronic[2];
        array[0] = new TV();
        array[1] = new WashingMachine();

        for (Electronic e : array) {
            e.on();
        }

        for (Electronic e : array) {
            e.off();
        }

        Electronic tv = new TV();

        if (tv instanceof TV) {
            TV tv0 = (TV) tv;
        }
    }

}
