package lv.javaguru.lessons.lesson3;

/**
 * Created by olegssedacs on 11/06/2017.
 */
public class Loops {
    //0. print numbers from to with different loops

    public static void main(String[] args) {
        // these numbers can be asked from user;
        int from = 5;
        int to = 10;

        System.out.println("With FOR");
        for (int i = from; i < to; i++) {
            System.out.println(i);
        }

        System.out.println("With WHILE");
        int i = from;
        while (i < to) {
            System.out.println(i);
            i++;
        }

        System.out.println("With DO-WHILE");
        i = from;
        do {
            System.out.println(i);
            i++;
        } while (i < to);

    }

}
