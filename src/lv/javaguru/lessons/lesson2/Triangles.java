package lv.javaguru.lessons.lesson2;

import java.util.Scanner;

/**
 * Created by olegssedacs on 04/06/2017.
 */
public class Triangles {

    public static void main(String[] args) {
        System.out.println("Input 3 numbers : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Triangle doesn't exist");
        } else if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Triangle doesn't exist");
        } else if (a == b && c == b) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || c == a) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Simple triangle");
        }
    }

}
