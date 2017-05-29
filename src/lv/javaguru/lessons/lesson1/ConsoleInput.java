package lv.javaguru.lessons.lesson1;

import java.util.Scanner;

public class ConsoleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int numberFromUser = scanner.nextInt();
        System.out.println("Number = " + numberFromUser);

        System.out.print("Enter number : ");
        double secondNumberFromUser = scanner.nextDouble();
        System.out.println("Number = " + secondNumberFromUser);
    }
}
