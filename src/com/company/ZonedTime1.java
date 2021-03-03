package com.company;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedTime1 {
    public static void main(String[] args) {
        ZoneId ke = ZoneId.of("Africa/Nairobi");
        ZoneId aus = ZoneId.of("Australia/Melbourne");

        LocalDateTime current = LocalDateTime.now();

        ZonedDateTime keTime = ZonedDateTime.of(current, ke);
        ZonedDateTime ausTime = keTime.withZoneSameInstant(aus);

        System.out.println("Kenya Time: " + keTime);
        System.out.println("Melbourne Time: " + ausTime);
    }
}
