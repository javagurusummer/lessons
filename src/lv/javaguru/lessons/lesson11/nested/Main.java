package lv.javaguru.lessons.lesson11.nested;

public class Main {

    public static void main(String[] args) {
        SomeInterface.A a = new SomeInterface.A();

        SomeClass someClass = new SomeClass();
        SomeClass.A a1 = new SomeClass.A();
    }
}
