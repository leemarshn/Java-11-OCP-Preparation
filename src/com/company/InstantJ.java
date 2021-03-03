package com.company;

import java.time.*;

public class InstantJ {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        LocalDate current = LocalDate.now();
        Duration twoHours = Duration.ofHours(2);
        LocalDate foolsDay = LocalDate.of(2021, Month.APRIL, 1);
        Period howLong = Period.between(foolsDay, current);
        int daysToFoolsDay = howLong.getDays();

        LocalDateTime today = LocalDateTime.now();



        System.out.println("Current Time: " + current);
        System.out.println("Duration of two hours: " + twoHours.getSeconds());
        System.out.println("Days before fools day = " + daysToFoolsDay);
        System.out.println("LocalDateTime retrieve date only: " + today.toLocalDate());

        System.out.println("Fools Day is on: " + foolsDay);
    }
}
