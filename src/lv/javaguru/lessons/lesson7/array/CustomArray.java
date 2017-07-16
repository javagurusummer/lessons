package lv.javaguru.lessons.lesson7.array;

/**
 * Created by olegssedacs on 16/07/2017.
 */
public class CustomArray {

    private int[] array;
    private int nextIndex;

    public CustomArray(int size) {
        array = new int[size];
    }

    public void print() {
        System.out.print(this);
    }

    public int get(int index) {
        return array[index];
    }

    public void add(int value) {
        if (nextIndex == array.length) {
            resize(array.length + 1);
        }
        array[nextIndex] = value;
        nextIndex++;
    }

    private void resize(int newSize) {
        int[] newArray = new int[newSize];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(String.format("Array[%d] = %d\n", i, array[i]));
        }
        return sb.toString();
    }

}
