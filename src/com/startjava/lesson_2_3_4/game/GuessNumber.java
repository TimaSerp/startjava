package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Scanner console = new Scanner(System.in);
    private int randomNum;
    private int playerNum;
    private Player player1;
    private Player player2;
    private int iterrationStep;
    private Player playerX;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guessNumber() {
        Random random = new Random();
        randomNum = random.nextInt(100) + 1;
        System.out.println("В игре участвуют " + player1.getName() + " и " + player2.getName());
        System.out.println("У вас есть по 10 попыток.");
        for (iterrationStep = 0; iterrationStep < 10; iterrationStep++) {
            if (checkWinPlayer()) {
                break;
            }
        }
        printArray();
    }

    private boolean checkWinPlayer() {
        for (int i = 0; i <= 1; i++) {
            playerX = i == 0 ? player1 : player2;
            System.out.println("\nИгрок " + playerX.getName() + " делает свой ход.");
            playerNum = console.nextInt();
            playerX.setNumber(playerNum, iterrationStep);
            if (playerNum == randomNum) {
                System.out.print("\nИгрок " + playerX.getName() + " угадал число " + randomNum);
                System.out.println(" с " + (iterrationStep + 1) + "-й попытки");
                return true;
            } else if (playerNum < 1 || playerNum > 100) {
                i--;
            } else {
                String answer = playerNum > randomNum ? "больше" : "меньше";
                System.out.print("Данное число " + answer + " того, что загадал компьютер");
            }
            if (iterrationStep == 9) {
                System.out.println("\nУ игрока " + playerX.getName() + " закончились попытки");
            }
        }
        return false;
    }

    private void printArray() {
        for (int i = 0; i <= 1; i++) {
            int arrayLength = 0;
            playerX = i == 0 ? player1 : player2;
            System.out.println("\nЧисла игрока " + playerX.getName());
            for (int j = 0; j < 10; j++) {
                if (playerX.getNumber()[j] == 0) {
                    break;
                }
                arrayLength++;
            }

            for (int j = 0; j < arrayLength; j++) {
                System.out.print(playerX.getNumber()[j] + " ");
            }
            playerX.clearArray(arrayLength);
        }
    }


}