package lv.javaguru.lessons.lesson11.maps;

import java.util.HashMap;
import java.util.Map;

public class MamSimpleExample {

    public static void main(String[] args) {
        String text = "aa aa aa b gghj ddld nnn nnn lo ppp";
        Map<String, Integer> words = parseWordOccurrence(text);
        printMap(words);
        System.out.println("--------------");
        Map<String, Integer> characters = parseCharOccurrence(text);
        printMap(characters);
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s = %d\n", entry.getKey(), entry.getValue());
        }
    }

    private static Map<String, Integer> parseWordOccurrence(String text) {
        String[] words = text.split(" ");
        Map<String, Integer> wordsAndOccurancies = new HashMap<>();
        for (String word : words) {
            Integer count = wordsAndOccurancies.get(word);
            if (count == null) {
                wordsAndOccurancies.put(word, 1);
            } else {
                wordsAndOccurancies.put(word, ++count);
            }
        }
        return wordsAndOccurancies;
    }

    private static Map<String, Integer> parseCharOccurrence(String text) {
        String[] chars = text.split("");
        Map<String, Integer> characters = new HashMap<>();
        for (String aChar : chars) {
            if (aChar.trim().isEmpty()) {
                continue;
            }
            Integer count = characters.get(aChar);
            if (count == null) {
                characters.put(aChar, 1);
            } else {
                characters.put(aChar, ++count);
            }
        }
        return characters;
    }

}
