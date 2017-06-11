package com.company.lesson3;

import java.util.Scanner;

/**
 * Created by olegssedacs on 11/06/2017.
 */
public class SumOfNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
            //same as
//            int last = number % 10;
//            sum = sum + last;
//            number = number / 10;
        }
        System.out.println("Sum = " + sum);
    }
}
