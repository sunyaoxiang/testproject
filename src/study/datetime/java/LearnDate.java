package study.datetime.java;

import java.time.*;

/**
 * Created by yaoxiang.sun on 2018/6/11.
 */
public class LearnDate {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2018, 6, 11);
        LocalTime time = LocalTime.of(10, 30, 00);
        LocalDateTime dateTime = LocalDateTime.of(2018, 6, 11, 10, 30, 00);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("+08"));
        Instant a = Instant.now();
        OffsetDateTime b = a.atOffset(ZoneOffset.ofHours(8));
    }
}
