package com.freestack.centralenantes.exed.tutorials.a_with_hands;

public class MainWithOtherClass {

    static void callWelcomeService(){
        WelcomeService welcomeService = new WelcomeService();

        welcomeService.setHelloWord("Hello World");

        System.out.println(welcomeService.sayHello());
    }

    public static void main(String[] args) {
        System.out.println("Please wait, we are waiting for our welcome service.");
        callWelcomeService();
    }
}

class WelcomeService {

    private String helloWord = "Ola todos"; // This line should not be modified

    public String getHelloWord() {
        return helloWord;
    }

    public void setHelloWord(String helloWord) {
        this.helloWord = helloWord;
    }

    public String sayHello(){
        return this.helloWord;
    }

}
