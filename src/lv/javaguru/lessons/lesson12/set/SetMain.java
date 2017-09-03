package lv.javaguru.lessons.lesson12.set;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {

        String text = "aa s d fff kkk fff lll lll";
        Set<String> uniqueWords = new HashSet<>();
        String[] split = text.split(" ");
        for (String s : split) {
            uniqueWords.add(s);
        }

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

}
