package lv.javaguru.lessons.lesson4;

import java.util.Random;

/**
 * Created by olegssedacs on 18/06/2017.
 */
public class Arrays {

    public static void main(String[] args) {
        int [] array = new int[10];
        ArrayUtils.fillWithRandomNumbers(array, 100);
        ArrayUtils.print(array);
        int a = 8;
        int b = a;

    }
}
