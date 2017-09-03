package lv.javaguru.lessons.lesson13.calc;

import java.math.BigDecimal;

public class GenericCalculator {

    public <T extends Number> BigDecimal sum(T first, T second) {
        BigDecimal f = new BigDecimal(String.valueOf(first));
        BigDecimal s = new BigDecimal(String.valueOf(second));
        return f.add(s);
    }

    public <T extends Number> BigDecimal multiply(T first, T second) {
        BigDecimal f = new BigDecimal(String.valueOf(first));
        BigDecimal s = new BigDecimal(String.valueOf(second));
        return f.multiply(s);
    }

}
