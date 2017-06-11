package com.company.lesson3;

/**
 * Created by olegssedacs on 11/06/2017.
 */
public class StringFormat {

    public static void main(String[] args) {
        double number = 23.9876;
        System.out.printf("Number = %.2f\n", number);

        System.out.printf("%-10s%-10s%-10s\n", "No", "A", "B");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d%-10d%-10d\n", i, i * 2, i * 3);
        }
    }

}
