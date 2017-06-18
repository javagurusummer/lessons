package lv.javaguru.lessons.lesson3;

/**
 * Created by olegssedacs on 11/06/2017.
 */
public class EvenOrOddNumbers {

    public static final int FROM = 0;
    public static final int TO = 20;

    public static void main(String[] args) {
        for (int i = FROM; i <= TO; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }

}
