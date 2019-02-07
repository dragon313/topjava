package ru.javawebinar.topjava.model;

import lombok.ToString;

import java.time.LocalDateTime;

@ToString
public class UserMealWithExceed {
    private final LocalDateTime dateTime;

    private final String description;

    private final int calories;

    private final boolean exceed;

    public UserMealWithExceed(LocalDateTime dateTime, String description, int calories, boolean exceed) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.exceed = exceed;
    }

    public UserMealWithExceed(UserMeal userMeal, boolean isExceed) {
        dateTime = userMeal.getDateTime();
        description = userMeal.getDescription();
        calories = userMeal.getCalories();
        exceed = isExceed;
    }
}
