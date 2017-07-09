package lv.javaguru.lessons.lesson6;

/**
 * Created by olegssedacs on 09/07/2017.
 */
public class DoubleUtils {

    public static boolean areEqual(double first, double second, double precision) {
        return Math.abs(first - second) < precision;
    }

}
