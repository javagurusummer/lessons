package lv.javaguru.lessons.lesson11.enums;

public enum Currency {

    USD(840),
    EUR(978);

    private int code;

    Currency(int code) {
        this.code = code;
    }

    public static Currency fromCode(int code) {
        for (Currency c : values()) {
            if (c.getCode() == code) {
                return c;
            }
        }
        throw new IllegalArgumentException("Wrong code : " + code);
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return name() + " : " + code;
    }
}
