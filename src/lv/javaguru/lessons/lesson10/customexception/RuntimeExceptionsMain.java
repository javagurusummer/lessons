package lv.javaguru.lessons.lesson10.customexception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class RuntimeExceptionsMain {

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundRuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        openFile();
    }

    public static FileReader openFile() {
        try {
            return new FileReader("~not_exist.txt");
        } catch (FileNotFoundException e) {
            // we created own runtime exception to avoid writing "throws Exception" for every method
            throw new FileNotFoundRuntimeException(e, "~not_exist.txt");
        }
    }

}
