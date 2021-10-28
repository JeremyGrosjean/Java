package com.freestack.centralenantes.exed.tutorials;

import java.util.Scanner;

public class DayFinder {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a day number!");
        int dayWeek = scanner.nextInt();
        if (dayWeek == 0) {
            System.out.println("Lundi");
        } else if (dayWeek == 1) {
            System.out.println("Mardi");
        } else if (dayWeek == 2) {
            System.out.println("Mercredi");
        } else if (dayWeek == 3) {
            System.out.println("Jeudi");
        } else if (dayWeek == 4) {
            System.out.println("Vendredi");
        } else if (dayWeek == 5) {
            System.out.println("Samedi");
        } else if (dayWeek == 6) {
            System.out.println("Dimanche");
        } else {
            System.out.println("Seules les valeurs de 1 à 7 sont autorisées");
        }


    }

}
