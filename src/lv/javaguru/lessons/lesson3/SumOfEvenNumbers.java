package lv.javaguru.lessons.lesson3;

/**
 * Created by olegssedacs on 11/06/2017.
 */
public class SumOfEvenNumbers {

    public static final int FROM = 0;
    public static final int TO = 20;

    public static void main(String[] args) {
        int sum = 0;
        for (int i = FROM; i <= TO; i++) {
            if (i % 2 == 0) {
                // sum = sum + i;
                sum += i;
            }
        }
        System.out.println("Sum of even numbers = " + sum);

        int start = FROM % 2 == 0 ? FROM : FROM + 1;
        // same as

//        if (FROM % 2 == 0){
//            start = FROM;
//        } else {
//            start = FROM + 1;
//        }
        int sumOfEven = 0;
        for (int i = start; i <= TO; i += 2) {
            sumOfEven += i;
        }
        System.out.println("Sum = " + sumOfEven);
    }

}
