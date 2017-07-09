package lv.javaguru.lessons.lesson6.tests;

import lv.javaguru.lessons.lesson6.ArrayUtilities;

/**
 * Created by olegssedacs on 09/07/2017.
 */
public class ArrayUtilitiesTests {

    public static void main(String[] args) {
        testCountSum();
        testCountAverage();
        testCountAverageIn2DArray();
    }

    static void testCountAverageIn2DArray() {
        double[][] array = {
                {1, 2},
                {2, 4}
        };
        double expected = 3;
        double average = ArrayUtilities.countAverage(array, 1);
        boolean result = Math.abs(expected - average) < 0.00001;
        System.out.println("Test countAverage in 2d array= " + result);
    }

    static void testCountAverage() {
        double[] array = {2.2, 3.8, 4};
        double expected = 3.3333333333333;
        double average = ArrayUtilities.countAverage(array);
        boolean result = Math.abs(expected - average) < 0.00001;
        System.out.println("Test countAverage = " + result);
    }

    static void testCountSum() {
        double[] array = {2.2, 3, 4};
        double expected = 9.2;
        double sum = ArrayUtilities.countSum(array);
        boolean result = Math.abs(expected - sum) < 0.00001;
        System.out.println("Test countSum = " + result);
    }

}
