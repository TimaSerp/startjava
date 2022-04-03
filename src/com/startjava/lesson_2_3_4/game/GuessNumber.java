package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Scanner console = new Scanner(System.in);
    private int randomNum;
    private Player player1;
    private Player player2;
    private int attempts;
    private Player currentPlayer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guessNum() {
        Random random = new Random();
        randomNum = random.nextInt(100) + 1;
        System.out.println("В игре участвуют " + player1.getName() + " и " + player2.getName());
        System.out.println("У вас есть по 10 попыток.");
        for (attempts = 0; attempts < 10; attempts++) {
            if (determineWinner()) {
                break;
            }
        }
        printPlayerAttempts();
        player1.clearArray();
        player2.clearArray();
    }

    private boolean determineWinner() {
        int playerNum;
        for (int i = 0; i <= 1; i++) {
            currentPlayer = i == 0 ? player1 : player2;
            System.out.println("\nИгрок " + currentPlayer.getName() + " делает свой ход.");
            playerNum = console.nextInt();
            if (currentPlayer.setNum(playerNum, attempts)) {
                i--;
            } else if (playerNum == randomNum) {
                    System.out.print("\nИгрок " + currentPlayer.getName() + " угадал число " + randomNum);
                    System.out.println(" с " + (attempts + 1) + "-й попытки");
                    return true;
            } else {
                String answer = playerNum > randomNum ? "больше" : "меньше";
                System.out.print("Данное число " + answer + " того, что загадал компьютер");
            }
            if (attempts == 9) {
                System.out.println("\nУ игрока " + currentPlayer.getName() + " закончились попытки");
            }
        }
        return false;
    }

    private void printPlayerAttempts() {
        for (int i = 0; i <= 1; i++) {
            currentPlayer = i == 0 ? player1 : player2;
            System.out.println("\nЧисла игрока " + currentPlayer.getName());
            for (int playerNum: currentPlayer.getNum()) {
                System.out.print(playerNum + " ");
            }
        }
    }
}