package lv.javaguru.lessons.lesson5;

import java.util.Random;

/**
 * Created by olegssedacs on 02/07/2017.
 */
public class TwoDementialsArrays {

    //two demential array contains one-demetial arrays
    // int[3][4] - contains 3 arrays with 4 elements
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        fillWithRandom(array, 100);
        print(array);
    }

    //fill two-demential array
    public static void fillWithRandom(int [][]array, int bound){
        for (int i = 0; i < array.length; i++) {
            //fill each one-demential array in loop
            fillWithRandom(array[i], bound);
        }
    }

    //fill one-demential array
    public static void fillWithRandom(int []array, int bound){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }
    }

    public static void print(int[][]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Array[%d][%d] = %d\n", i, j, array[i][j]);
            }
        }
    }

}
