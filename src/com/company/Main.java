package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int max = 0;
        int randomNumber = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Hi, what's your name?");
        String playerName = reader.nextLine();
        System.out.println("Hi " + playerName + ", let's play the guessing game");
        System.out.println("Choose a game mode: 1)1-10 2)1-100 3) 1-1000 4)1-10000. Type in 1 ,2, 3, or 4.");
        int gameMode = reader.nextInt();
        if (gameMode == 1) {
            max = 10;
            randomNumber = ((int) (Math.random() * 10));
        } else if (gameMode == 2) {
            max = 100;
            randomNumber = ((int) (Math.random() * 100));
        } else if (gameMode == 3) {
            max = 1000;
            randomNumber = ((int) (Math.random() * 1000));
        } else {
            max = 10000;
            randomNumber = ((int) (Math.random() * 10000));
        }
        int guess = -1;
        while (guess != randomNumber) {
            System.out.println("Guess a number between 1 and " + max);
            guess = reader.nextInt();
            if (guess == randomNumber) {
                System.out.println("You got the correct answer!");
            }
        }

    }
}
