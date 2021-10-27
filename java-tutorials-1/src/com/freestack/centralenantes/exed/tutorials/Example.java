package com.freestack.centralenantes.exed.tutorials;

import static java.lang.System.*;

public class Example {

    public static void main(String[] args) {
        int tabOne[] = {2, 4, 6, 8, 10};
        int tabTwo[] = new int[3];
        tabTwo = tabOne;
        tabTwo[0] = 100;
        System.out.print(tabOne[0] + " VS " + tabTwo[0]);

    }

}
