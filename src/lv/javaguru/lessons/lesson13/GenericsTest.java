package lv.javaguru.lessons.lesson13;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        Integer integer = integers.get(1);

        List list = integers;
        list.add("string");

        System.out.println(integers);

    }

}
