package lv.javaguru.lessons.lesson4;

import java.util.Random;

/**
 * Created by olegssedacs on 18/06/2017.
 */
public class MinInArray {

    public static void main(String[] args) {
        int [] array = new int[10];

        // fill array with random numbers
        ArrayUtils.fillWithRandomNumbers(array, 50, 60);

        // find min in array
        int min = ArrayUtils.findMinValue(array);
        System.out.println("Min = " + min);

        //find index with min value
        int indexWithMin = ArrayUtils.findIndexWithMinValue(array);
        System.out.println("Min index = " + indexWithMin);
        // print array
        ArrayUtils.print(array);
    }
}
