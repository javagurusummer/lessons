package lv.javaguru.lessons.lesson7.tv;

import lv.javaguru.lessons.lesson7.CustomArray;

/**
 * Created by olegssedacs on 16/07/2017.
 */
public class CustomArrayMain {

    public static void main(String[] args) {
        CustomArray array = new CustomArray(3);
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        array.print();

        System.out.println("7 = " + array.get(7));
    }

}
