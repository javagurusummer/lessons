package lv.javaguru.lessons.lesson10;

public class Finally {

    public static void main(String[] args) {
        System.out.println(doSomething());
    }

    // finally block always executes
    // in this block you should manage resources
    // for example, close file or close http connection
    public static int doSomething() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            // never use return in finally block
            // method will always return 9
            return 9;
        }

    }

}
