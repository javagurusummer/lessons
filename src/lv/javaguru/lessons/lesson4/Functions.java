package lv.javaguru.lessons.lesson4;

import java.util.Scanner;

/**
 * Created by olegssedacs on 18/06/2017.
 */
public class Functions {

    public static int counter = 0;

    public static void main(String[] args) {
        boolean isEven = isEven(5);
        System.out.println("Max = " + max(5, 4));
        System.out.println("Power = " + power(2, 3));
        int number = getIntFromConsole("Input number : ");
    }

    public static int getIntFromConsole(String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int power(int value, int power){
        int result = 1;
        for (int i = 0; i < power; i++) {
            // same as
            // result = result * value;
            result *= value;
        }
        return result;
    }

    public static int max(int a, int b){
        if (a > b){
            return a;
        }
        return b;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
        //same as :
        // boolean even = number % 2 == 0;
        // return even;
    }

}
