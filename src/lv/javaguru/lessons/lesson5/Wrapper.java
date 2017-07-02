package lv.javaguru.lessons.lesson5;

/**
 * Created by olegssedacs on 02/07/2017.
 */
public class Wrapper {

    public static void main(String[] args) {
        int array[] = {1, 2, 4};
        int max = max(array);
        max = max(1,2,3,4,6);
        System.out.println(max);
    }

    public static double average(int...values){
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / (double)values.length;
    }

    public static int max(int...values){
        int max = Integer.MIN_VALUE;
        for (int number : values){
            max = max < number ? number : max;
        }
        return max;
    }

}
