package com.freestack.centralenantes.exed.tutorials.b_exceptions;

public class ApplicationOne {

    public void consume(int day) {

        DayConverter dayConverter = new DayConverter();
        try {
            System.out.println(dayConverter.compute(day));
        } catch (Exception myexception) {
            System.out.println(myexception.getMessage());
        }

    }

}
