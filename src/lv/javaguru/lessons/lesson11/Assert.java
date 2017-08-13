package lv.javaguru.lessons.lesson11;

import lv.javaguru.lessons.lesson11.nested.AssertionException;

import java.math.BigDecimal;

public class Assert {

    public static void nonNull(Object o, String argumentName) {
        if (o == null) {
            throw new AssertionException(String.format("%s : %s", argumentName, " cannot be null"));
        }
    }

    public static void notNullOrEmpty(String o, String argumentName) {
        nonNull(o, argumentName);
        if (o.trim().isEmpty()) {
            throw new AssertionException(String.format("%s : %s", argumentName, " cannot be null or empty"));
        }
    }

    public static void nonNegative(Number o, String argumentName) {
        nonNull(o, argumentName);
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(o));
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            throw new AssertionException(String.format("%s : %s", argumentName, " must be positive"));
        }
    }

}
