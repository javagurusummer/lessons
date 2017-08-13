package lv.javaguru.lessons.lesson11.enums;

import java.time.LocalTime;

public enum Schedule {

    MONDAY(Day.MONDAY, LocalTime.of(8, 00), LocalTime.of(18, 00));

    private Day day;
    private LocalTime start;
    private LocalTime end;

    Schedule(Day day, LocalTime start, LocalTime end) {
        this.day = day;
        this.start = start;
        this.end = end;
    }
}
