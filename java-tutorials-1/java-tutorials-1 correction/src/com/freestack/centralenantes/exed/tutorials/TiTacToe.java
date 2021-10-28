package com.freestack.centralenantes.exed.tutorials;

import java.util.Scanner;

public class TiTacToe {

    public static boolean hasWon(int[][] grid) {
        int sum;
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += grid[i][j];
            }
            if (sum == 3 || sum == -3) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += grid[j][i];
            }
            if (sum == 3 || sum == -3) {
                return true;
            }
        }

        sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += grid[i][i];
            if (sum == 3 || sum == -3) {
                return true;
            }

        }

        sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += grid[2 - i][i];
            if (sum == 3 || sum == -3) {
                return true;
            }
        }

        return false;
    }

    public static String printGrid(int[][] grid) {
        String gridView = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gridView += grid[i][j];
            }
            gridView += "\n___\n";
        }
        return gridView;
    }


    public static void main(String[] args) {

        int[][] grid = new int[3][3];

        boolean ended = false;
        boolean firstPlayer = true;
        int tries = 0;
        while (!ended) {

            Scanner scanner = new Scanner(System.in);
            if (firstPlayer) {
                System.out.println("Please select your row player 1!");
            } else {
                System.out.println("Please select your row player 2!");
            }
            int row = scanner.nextInt();
            if (firstPlayer) {
                System.out.println("Please select your column player 1!");
            } else {
                System.out.println("Please select your column player 2!");
            }

            int column = scanner.nextInt();
            if (grid[row][column] != 0) {
                System.out.println("!!!!!Already played here!!!!!");
            } else {
                grid[row][column] = firstPlayer ? 1 : -1;
                if (hasWon(grid)) {
                    ended = true;
                    System.out.println("#####You won#####");
                }
                if (tries > 9) {
                    ended = true;
                }
            }

            firstPlayer = !firstPlayer;
            tries++;
            System.out.println(printGrid(grid));
        }


    }

}
