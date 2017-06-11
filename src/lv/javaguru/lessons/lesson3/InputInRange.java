package com.company.lesson3;

import java.util.Scanner;

/**
 * Created by olegssedacs on 11/06/2017.
 */
public class InputInRange {

    public static final int FROM = 10;
    public static final int TO = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            System.out.printf("Enter number from %d to %d : ", FROM, TO);
            input = scanner.nextInt();
        } while (input < FROM || input > TO);
        System.out.println("OK");
    }

}
