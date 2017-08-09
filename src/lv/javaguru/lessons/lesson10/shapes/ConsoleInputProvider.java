package lv.javaguru.lessons.lesson10.shapes;

import java.util.Scanner;

public class ConsoleInputProvider {

    public ConsoleInputProvider() {
    }

    public double getDouble(String message) {
        return Double.parseDouble(getString(message));
    }

    public int getInt(String message) {
        return Integer.parseInt(getString(message));
    }

    private String getString(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

}
