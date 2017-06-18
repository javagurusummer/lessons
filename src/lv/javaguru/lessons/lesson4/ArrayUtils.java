package lv.javaguru.lessons.lesson4;

import java.util.Random;

/**
 * Created by olegssedacs on 18/06/2017.
 */
public class ArrayUtils {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d] = %d\n", i, array[i]);
        }
    }

    public static int findMinValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findIndexWithMinValue(int[] array){
        int index = 0;
        int min = array[index];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void fillWithRandomNumbers(int[]array, int bound){
        fillWithRandomNumbers(array, 0, bound);
    }

    public static void fillWithRandomNumbers(int[]array, int boundFrom, int boundTo){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(boundTo - boundFrom) + boundFrom;
        }
    }
}
