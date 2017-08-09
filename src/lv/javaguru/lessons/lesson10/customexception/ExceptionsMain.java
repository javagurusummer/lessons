package lv.javaguru.lessons.lesson10.customexception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsMain {

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // if method doesn't catch checked exception
    // then you have to write for method "throws FileNotFoundException"
    // it means that exception must be caught in upper level
    public static void method1() throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException {
        method3();
    }

    public static void method3() throws FileNotFoundException {
        openFile();
    }

    public static FileReader openFile() throws FileNotFoundException {
        return new FileReader("~not_exist.txt");
    }

}
