package com.company.lesson3;

import java.util.Scanner;

/**
 * Created by olegssedacs on 11/06/2017.
 */
public class LowestNumberFromUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean numberEntered = false;
        int min = Integer.MAX_VALUE;
        while (true) {
            System.out.print("Input number : ");
            String input = scanner.nextLine();
            if (input.equals("") && !numberEntered) {
                continue;
            }
            if (input.equals("")) {
                break;
            }
            int number = Integer.parseInt(input);
            if (number < min) {
                min = number;
            }
            numberEntered = true;
        }
        System.out.println("Min = " + min);
    }

}
