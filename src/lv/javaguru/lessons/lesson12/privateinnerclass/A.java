package lv.javaguru.lessons.lesson12.privateinnerclass;

import java.util.HashMap;
import java.util.Map;

public class A {

    public static void main(String[] args) {
        A a = new A();
        a.doSomething();
    }

    public void doSomething() {
        String text = "aaa sss fff fff fff bbb";
        Result result = findWordWithHighiestOccurency(text);
        System.out.println("word = " + result.word);
        System.out.println("count = " + result.count);
    }

    private Result findWordWithHighiestOccurency(String text) {
        Map<String, Integer> words = new HashMap<>();
        for (String str : text.split(" ")) {
            put(words, str);
        }
        int max = 0;
        String resultWord = null;
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() > max) {
                resultWord = entry.getKey();
                max = entry.getValue();
            }
        }
        return new Result(resultWord, max);
    }

    private void put(Map<String, Integer> map, String value) {
        Integer count = map.get(value);
        if (count == null) {
            map.put(value, 1);
        } else {
            map.put(value, ++count);
        }
    }

    private class Result {
        String word;
        int count;

        public Result(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }

}
