package lv.javaguru.lessons.lesson1;

public class MathOperations {

    public static void main(String[] args) {
        int variable = 5;
        variable = 6;
        variable = variable * variable;
        System.out.println("Variable = " + variable);

        int sum = 10 + 9;
        System.out.println("Sum = " + sum);

        int quotientOfIntegers = 3 / 2;
        System.out.println("Quotient of integers = " + quotientOfIntegers);

        double quotientOfDouble = 3 / 2;
        System.out.println("Quotient of double 3/2 = " + quotientOfDouble);

        quotientOfDouble = 3 / 2.0;
        System.out.println("Quotient of double 3/2.0 = " + quotientOfDouble);

        // DO NOT DO LIKE
        int first = 0, second = 0, third = 5;
        // CORRECT
        int fourth = 0;
        int fifth = 2;

        int modulo = 1234 % 10;
        System.out.println("Modulo 1234 % 10 = " + modulo);

        boolean equals = fourth > fifth;
        System.out.println("Variables equals = " + equals);

        boolean notEquals = fourth != fifth;
        System.out.println("Variables not equals = " + notEquals);

        boolean reversedNotEquals = !notEquals;
        System.out.println("Reversed boolean notEquals = " + reversedNotEquals);

        char b = 'a' + 1;
        System.out.println("Character = " + b);

        int bCode = (int) b;
        System.out.println("Code of 'b' = " + bCode);

        int fromDouble = (int) 5.4;
        System.out.println("Integer from double = " + fromDouble);

        int counter = 0;
        int result = counter--;
        System.out.println("Result = " + result + " counter = " + counter);

        int number = 0;
        number = number++;
        System.out.println(number);
    }

}
