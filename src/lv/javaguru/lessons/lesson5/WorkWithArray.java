package lv.javaguru.lessons.lesson5;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by olegssedacs on 02/07/2017.
 */
public class WorkWithArray {

    public static void main(String[] args) {
        int [] array = new int[5];
        fillArrayWithRandom(array, 100);
        int indexOfMax = findIndexOfMax(array);
        System.out.println(Arrays.toString(array));
        System.out.println(indexOfMax);
    }

    public static void fillArrayWithRandom(int[] a, int bound){
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(bound);
        }
    }

    public static int findIndexOfMax(int[]array){
        int max = findMax(array);
        return findIndexOf(array, max);
    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int number : array){
            if (max < number){
                max = number;
            }
        }
        return max;
    }

    public static int findIndexOf(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

}
