package lv.javaguru.lessons.lesson10.shapes;

import java.io.FileWriter;
import java.io.IOException;

public class Resources {

    public static void main(String[] args) {

        //approach name : try-with-resources
        // we don't have to close file writer
        // it will be close automatically because it implements interface AutoClosable
        try (FileWriter fileWriter = new FileWriter("/Users/olegssedacs/IdeaProjects/summer_sundays/src/lv/javaguru/lessons/lesson10/shapes/file.txt")) {
            // write something to file

        } catch (IOException e) {
            e.printStackTrace();
        }


        // old way
        // file writer should be closed in finally block
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("/Users/olegssedacs/IdeaProjects/summer_sundays/src/lv/javaguru/lessons/lesson10/shapes/file.txt");
        } catch (IOException e) {
            // do something is file not found or file is read-only
        } finally {
            // this block is for resources closing/releasing
            // this block always executes
            closeFile(fileWriter);
        }
    }

    // if exception is thrown when we trying to close file write
    // then we ignore it
    private static void closeFile(FileWriter fileWriter) {
        if (fileWriter == null) {
            return;
        }
        try {
            fileWriter.close();
        } catch (IOException ignore) {
            /* NOP */
        }
    }


}
