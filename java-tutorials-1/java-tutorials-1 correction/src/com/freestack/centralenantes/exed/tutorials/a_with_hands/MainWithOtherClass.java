package com.freestack.centralenantes.exed.tutorials.a_with_hands;

public class MainWithOtherClass {

    static void callWelcomeService(){
        WelcomeService welcomeService = new WelcomeService();

        // add some code here to modify value of field in welcomeService
        welcomeService.setHelloWord("hello world");

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
    public String getHelloWord() {
        return helloWord;
    }

    public WelcomeService setHelloWord(String helloWord) {
        this.helloWord = helloWord;
        return this;
    }

    public String sayHello(){
        return this.helloWord;
    }

}
