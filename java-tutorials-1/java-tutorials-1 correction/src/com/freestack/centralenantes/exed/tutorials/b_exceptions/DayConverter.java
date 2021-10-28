package com.freestack.centralenantes.exed.tutorials.b_exceptions;

public class DayConverter {

    public String compute(int dayIndex) throws Exception {
        String day;
        switch (dayIndex) {
            case 1:
                day = "lundi";
                break;
            case 2:
                day = "mardi";
                break;
            case 3:
                day = "mercredi";
                break;
            case 4:
                day = "jeudi";
                break;
            case 5:
                day = "vendredi";
                break;
            case 6:
                day = "samedi";
                break;
            case 7:
                day = "dimanche";
                break;
            default:
                throw new Exception("wrong value: dayIndex should be >=1 and <= 7");
        }
        return day;
    }

}
