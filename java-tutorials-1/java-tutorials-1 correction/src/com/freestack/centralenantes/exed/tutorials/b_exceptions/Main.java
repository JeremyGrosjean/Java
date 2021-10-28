package com.freestack.centralenantes.exed.tutorials.b_exceptions;

public class Main {

    public static void main(String[] args){

        ApplicationOne applicationOne = new ApplicationOne();
        ApplicationTwo applicationTwo = new ApplicationTwo();

        applicationOne.consume(1);

        applicationTwo.consume(10);
    }
}
