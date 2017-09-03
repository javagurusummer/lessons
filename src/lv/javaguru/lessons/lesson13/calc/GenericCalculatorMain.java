package lv.javaguru.lessons.lesson13.calc;

public class GenericCalculatorMain {

    public static void main(String[] args) {
        GenericCalculator calculator = new GenericCalculator();

        System.out.println(calculator.sum(2D, 4.5));
        System.out.println(calculator.multiply(2, 3.333));

        calculator.sum(2, 2);
    }

}
