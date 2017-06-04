package lv.javaguru.lessons.lesson2;

/**
 * Created by olegssedacs on 04/06/2017.
 */
public class EvenOrOdd {

    public static void main(String[] args) {
        int number = 100;
        boolean isEven = number % 2 == 0;
        if (isEven) {
            System.out.println("Number " + number + " is even");
        } else {
            System.out.println("Number " + number + " is odd");
        }
        // ternary operator
        String message = "Number " + number + " is ";
//        message += isEven ? "even" : "odd";
        message = isEven ? message + "even" : message + "odd";
        System.out.println(message);

        int a = 30;
        int b = a > 20 ? 90 : 0;
        System.out.println(b);
    }

}
