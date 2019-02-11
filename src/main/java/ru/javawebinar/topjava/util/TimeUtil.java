package ru.javawebinar.topjava.util;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Утилитный класс для работы со временем
 */
public class TimeUtil {

    /**
     * Метод определяет находится ли дата в заданном промежутке
     *
     * @param lt        дата, которую нужно проверить
     * @param startTime дата начала промежутка
     * @param endTime   дата окончания промежутка
     * @return возвращает {@code true} если дата входит в промежуток, иначе {@code false}
     */
    public static boolean isBetween(LocalTime lt, LocalTime startTime, LocalTime endTime) {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) <= 0;
    }
}
