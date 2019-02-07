package ru.javawebinar.topjava.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Meal {
    private final LocalDateTime dateTime;

    private final String description;

    private final int calories;

    public Meal(LocalDateTime dateTime, String description, int calories) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
    }
}
