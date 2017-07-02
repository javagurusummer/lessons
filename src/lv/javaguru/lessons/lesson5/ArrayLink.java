package lv.javaguru.lessons.lesson5;

/**
 * Created by olegssedacs on 02/07/2017.
 */
public class ArrayLink {

    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = array1;

        array1[1] = 30;
        array2[1] = 100;

        System.out.println(array1[1]);
        System.out.println(array2[1]);
    }

}
