package lv.javaguru.lessons.lesson11.enums;

public enum AccountStatus {

    BLOCKED("red"),
    ACTIVE("green");

    private String color;

    AccountStatus(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
