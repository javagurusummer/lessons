package lv.javaguru.lessons.lesson6.tests;

import lv.javaguru.lessons.lesson6.DoubleUtils;

/**
 * Created by olegssedacs on 09/07/2017.
 */
public class DoubleUtilsTests {

    public static void main(String[] args) {
        testAreEqual();
    }

    static void testAreEqual() {
        boolean expected = true;
        boolean equal = DoubleUtils.areEqual(2.99, 2.99, 0.000000001);
        boolean result = expected && equal;
        System.out.println("Test are equal : " + result);
    }
}
