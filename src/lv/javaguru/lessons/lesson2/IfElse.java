package lv.javaguru.lessons.lesson2;

import java.util.Scanner;

/**
 * Created by olegssedacs on 04/06/2017.
 */
public class IfElse {

    public static final int MIN = 0;
    public static final int MAX = 100;

    public static void main(String[] args) {
        System.out.print("Enter number from " + MIN + " to " + MAX + " : ");
        Scanner scanner = new Scanner(System.in);
        int numberFromUser = scanner.nextInt();
        if (numberFromUser >= MIN && numberFromUser <= MAX) {
            System.out.println("Your number = " + numberFromUser);
        } else {
            System.out.println("Error! Not in range");
        }
    }
}
