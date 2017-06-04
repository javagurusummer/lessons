package lv.javaguru.lessons.lesson2;

/**
 * Created by olegssedacs on 04/06/2017.
 */
public class VariableVisibility {

    public static void main(String[] args) {
        int a = 40;
        if (true) {
            a++;
            int b = 100;
        }
//        b = 23; -> b not visible
    }

}
