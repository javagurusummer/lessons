package lv.javaguru.lessons.lesson12.publicinnerclass;

import java.util.Iterator;

public class DataStructure implements Iterable<Integer> {

    private int elements;
    private int[] array;

    public DataStructure(int size) {
        this.array = new int[size];
    }

    public void put(int index, int value) {
        array[index] = value;
        elements++;
    }

    public int size() {
        return elements;
    }

    public int capacity() {
        return array.length;
    }

    public int free() {
        return array.length - elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Elements : ");
        sb.append("\n");
        for (int i = 0; i < array.length; i++) {
            sb
                    .append("index = ").append(i)
                    .append(" value = ").append(array[i])
                    .append("\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new DataIterator();
    }

    public class DataIterator implements Iterator<Integer> {

        private int current;

        public DataIterator() {
        }

        @Override
        public boolean hasNext() {
            return current < size();
        }

        @Override
        public Integer next() {
            return array[current++];
        }
    }

}
