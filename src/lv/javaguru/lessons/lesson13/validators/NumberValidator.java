package lv.javaguru.lessons.lesson13.validators;

public interface NumberValidator<T extends Number> extends Validator<T> {

    default void assertPositive(T number) {
        if (number.doubleValue() < 0) {
            throw new IllegalArgumentException("number must be positive");
        }
    }
}
