package lv.javaguru.lessons.lesson11.enums;

import java.util.Arrays;

public class EnumMain {

    public static void main(String[] args) {
        Day monday = Day.valueOf("MONDAY");

        Day[] days = Day.values();
        System.out.printf("%s = %d\n", monday, monday.ordinal());
        System.out.println(Arrays.toString(days));

        Currency usd = Currency.USD;
        System.out.println(usd);

        Currency fromName = Currency.valueOf("EUR");
        System.out.println(fromName);

        Currency fromCode = Currency.fromCode(978);
        System.out.println(fromCode);

        fromCode.compareTo(usd);
    }

}
