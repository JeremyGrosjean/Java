package com.freestack.centralenantes.exed.tutorials.b_exceptions;

import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.util.Locale;

public class ApplicationTwo {

    public void consume(int day) {

        DayConverter dayConverter = new DayConverter();
        try {
            System.out.println(dayConverter.compute(day));
        } catch (Exception myexception) {
            System.out.println(LocalDate.now().getDayOfWeek());
        }

    }
}
