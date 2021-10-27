package com.freestack.centralenantes.exed.tutorials.a_with_hands;

public class MainWithOtherClass {

    static void callWelcomeService(){
        WelcomeService welcomeService = new WelcomeService();

        // add some code here to modify value of field in welcomeService

        System.out.println(welcomeService.sayHello());
    }

    public static void main(String[] args) {
        System.out.println("Please wait, we are waiting for our welcome service.");
        callWelcomeService();
    }
}

class WelcomeService {

    private String helloWord = "Ola todos"; // This line should not be modified

    // add some code here to make helloWorld accessible from outside

    public String sayHello(){
        return this.helloWord;
    }

}
