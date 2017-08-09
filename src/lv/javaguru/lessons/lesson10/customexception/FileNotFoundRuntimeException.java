package lv.javaguru.lessons.lesson10.customexception;

public class FileNotFoundRuntimeException extends RuntimeException {

    public FileNotFoundRuntimeException(Exception e, String message) {
        super(message, e);
    }
}
