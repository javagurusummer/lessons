package com.company.lesson3;

import java.util.Scanner;

/**
 * Created by olegssedacs on 11/06/2017.
 */
public class BinaryNumberConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        int binary = scanner.nextInt();
        int decimal = 0;
        int power = 0;
        while (binary > 0) {
            int last = binary % 10;
            if (last > 1) {
                System.out.println("Not binary format");
                break;
            }
            binary /= 10;
            decimal += last * (int) Math.pow(2, power);
//            decimal = decimal + (int)Math.pow(2, power) + last;
            power++;
        }
        System.out.println("Decimal = " + decimal);
    }
}
