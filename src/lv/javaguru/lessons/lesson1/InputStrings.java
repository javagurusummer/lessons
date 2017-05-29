package lv.javaguru.lessons.lesson1;

import java.util.Scanner;

/**
 * Created by olegssedacs on 28/05/2017.
 */
public class InputStrings {

    public static void main(String[] args) {
        String hello = "Hello world!";
        System.out.println(hello);

        System.out.print("Enter string : ");
        Scanner scanner = new Scanner(System.in);
        String fromUser = scanner.nextLine();
        System.out.println("String from user = " + fromUser);

        System.out.println("Enter string : ");
        String anotherStringFromUser = scanner.nextLine();
        System.out.println("Concat strings : " + fromUser + " " + anotherStringFromUser);
    }
}
