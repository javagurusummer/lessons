package lv.javaguru.lessons.lesson6.tests;

import lv.javaguru.lessons.lesson6.ProductivityAnalizer;

/**
 * Created by olegssedacs on 09/07/2017.
 */
public class ProductivityAnalizerTests {

    public static final double[][] AMOUNTS = new double[][]{
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}
    };

    public static void main(String[] args) {
        testFindAverageByYear();
        testConvertYearToIndex();
        testFindMostProductiveMonth();
    }

    public static void testFindMostProductiveMonth() {
        int expected = 11;
        int mostProcustive = ProductivityAnalizer.findMostProductiveMonth(AMOUNTS, 2017);
        boolean result = expected - mostProcustive == 0;
        System.out.println("FindMostProductiveMonth = " + result);
    }

    static void testConvertYearToIndex() {
        int expected = 1;
        int index = ProductivityAnalizer.convertYearToIndex(2016);
        boolean result = expected - index == 0;
        System.out.println("ConvertYearToIndex : " + result);
    }

    static void testFindAverageByYear() {
        double expected = 6.5;
        double average = ProductivityAnalizer.findAverageByYear(AMOUNTS, 2017);
        boolean result = Math.abs(expected - average) < 0.00001;
        System.out.println("FindAverageByYear = " + result);
    }
}
