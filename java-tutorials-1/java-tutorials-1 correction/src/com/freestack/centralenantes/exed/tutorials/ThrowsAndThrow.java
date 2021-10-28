package com.freestack.centralenantes.exed.tutorials;

import java.util.Scanner;

public class ThrowsAndThrow {

    public static String convertToDayName(int dayWeek) throws  IllegalArgumentException, Exception {
        if (dayWeek > 6 || dayWeek < 0) {
            throw new Exception("day week should be between 0 and 6");
        }
        String dayName = "";
        if (dayWeek == 0) {
            dayName = "Lundi";
        } else if (dayWeek == 1) {
            dayName = "Mardi";
        } else if (dayWeek == 2) {
            dayName = "Mercredi";
        } else if (dayWeek == 3) {
            dayName= "Jeudi";
        } else if (dayWeek == 4) {
            dayName = "Vendredi";
        } else if (dayWeek == 5) {
            dayName = "Samedi";
        } else if (dayWeek == 6) {
            dayName = "Dimanche";
        }
        return dayName;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a day number!");
        int dayWeek = scanner.nextInt();
        //return extracted(dayWeek);
    }

    private static int extracted(int dayWeek) {
        try {
            String dayName = convertToDayName(dayWeek);
            System.out.println(dayName);
        } catch (IllegalArgumentException e) {
            System.out.println("Please rerun with another value");
        } catch (Exception e) {
            System.out.println("Please rerun with another value");
        } finally {
            System.out.println("Fin du traitement");
            return dayWeek;
        }
    }

}
