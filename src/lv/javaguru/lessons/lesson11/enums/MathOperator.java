package lv.javaguru.lessons.lesson11.enums;

public enum MathOperator {

    PLUS("+"),
    MINUS("-"),
    TIMES("*"),
    OBELUS("/");

    private String sign;

    MathOperator(String sign) {
        this.sign = sign;
    }

    public static MathOperator fromSign(String sign) {
        for (MathOperator mathOperator : values()) {
            if (mathOperator.getSign().equals(sign)) {
                return mathOperator;
            }
        }
        throw new IllegalArgumentException(sign);
    }

    public String getSign() {
        return sign;
    }
}
