package lv.javaguru.lessons.lesson7;

/**
 * Created by olegssedacs on 16/07/2017.
 */
public class CustomArray {

    private int[] array;
    private int lastAddedIndex = 0;

    public CustomArray(int size) {
        array = new int[size];
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Array[%d] = %d\n", i, array[i]);
        }
    }

    public int get(int index) {
        return array[index];
    }

    public void add(int value) {
        if (lastAddedIndex == array.length - 1) {
            resize(array.length + 1);
        }
        array[lastAddedIndex] = value;
        lastAddedIndex++;
    }

    public void resize(int newSize) {
        int[] newArray = new int[newSize];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

}
