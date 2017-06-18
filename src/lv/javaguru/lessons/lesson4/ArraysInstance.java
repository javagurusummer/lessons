package lv.javaguru.lessons.lesson4;

/**
 * Created by olegssedacs on 18/06/2017.
 */
public class ArraysInstance {

    public static void main(String[] args) {
        int[] array = new int[3];
        int[] array2 = array;

        array[2] = 4;
        System.out.println(array2[2]);

        setValueIntoArray(array2, 0, 100);
        System.out.println(array[0]);
    }

    public static void setValueIntoArray(int[] array, int index, int value){
        array[index] = value;
    }
}
