package lv.javaguru.lessons.lesson6;

/**
 * Created by olegssedacs on 09/07/2017.
 */
public class ArrayUtilities {

    public static final double PRECISION = 0.000000001;

    public static int findIndexOf(double[] array, double value) {
        for (int i = 0; i < array.length; i++) {
            if (DoubleUtils.areEqual(value, array[i], PRECISION)) {
                return i;
            }
        }
        return -1;
    }

    public static double findMax(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static double countAverage(double[][] array2d, int index) {
        double[] array = array2d[index];
        return countAverage(array);
    }

    public static double countAverage(double[] array) {
        double sum = countSum(array);
        return sum / array.length;
    }

    public static double countSum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
