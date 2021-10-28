package com.freestack.centralenantes.exed.tutorials.b_exceptions;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String day = "";

        System.out.println("Veuillez entrer un nombre compris entre 1 et 7 :");
        i = sc.nextInt();

        manageError(i);

    }

    public static String getDay(int i) throws Exception {

        String day;

        switch (i){
            case 1 :
                day = "Lundi";
                break;

            case 2 :
                day = "Mardi";
                break;

            case 3 :
                day = "Mercredi";
                break;

            case 4 :
                day = "Jeudi";
                break;

            case 5 :
                day = "Vendredi";
                break;

            case 6 :
                day = "Samedi";
                break;

            case 7 :
                day = "Dimanche";
                break;

            default :
                throw new Exception("Le nombre n'est pas entre 1 et 7");
        }

        return day;
    }

    public static void manageError(int i) {
        String day = "error";
        Scanner sc = new Scanner(System.in);

        try{
            day = getDay(i);
            System.out.println("Le jour selectionné est " + day);
        } catch (Exception e) {
            System.out.println("Le nombre n'est pas entre 1 et 7, veuillez recommencer :");
            i = sc.nextInt();
            manageError(i);
        }

    }
}
