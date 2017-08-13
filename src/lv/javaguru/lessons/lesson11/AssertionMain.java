package lv.javaguru.lessons.lesson11;

import lv.javaguru.lessons.lesson11.nested.AssertionException;

public class AssertionMain {

    public static void main(String[] args) {
        try {
            String s = "      ed";
            Assert.notNullOrEmpty(s, "s");
        } catch (AssertionException e) {
            System.out.println(e.getMessage());
        }
    }

}
