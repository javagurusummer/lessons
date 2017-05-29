package lv.javaguru.lessons.lesson1;

/**
 * Created by User on 30.01.2017.
 */
public class Variables {

    public static void main(String[] args) {
        int intNumber = 10000;
        long longNumber = 999999999;
        byte byteNumber = 21;

        double doubleNumber = 1.4;
        float floatNumber = 10.6F; // float number must have letter F or f after value;

        char a = 'a'; // character
        char c = 99; // ASCII code
        char p = '\u0070'; // UNICODE

        boolean yes = true;
        boolean no = false;

        String hello = "Hello";

        System.out.println("int intNumber = " + intNumber);
        System.out.println("long longNumber = " + longNumber);
        System.out.println("byte byteNumber = " + byteNumber);

        System.out.println("double doubleNumber = " + doubleNumber);
        System.out.println("float floatNumber = " + floatNumber);

        System.out.println("char a = " + a);
        System.out.println("char c = " + c);
        System.out.println("char p = " + p);

        System.out.println("boolean yes = " + yes);
        System.out.println("boolean no = " + no);

        System.out.println("String hello = " + hello);
    }
}
