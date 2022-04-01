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
    private int i;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private boolean checkWinPlayer() {
        playerNum = console.nextInt();
        player1.setNumber(playerNum, i);
        if (playerNum == randomNum) {
            return true;
        }
        String answer = playerNum > randomNum ? "больше" : "меньше";
        System.out.print("Данное число " + answer + " того, что загадал компьютер");
        return false;
    }

    private void printArray() {
        int arrayLength = 0;
        for (int i = 0; i < 20; i++) {
            if (player1.getNumber()[i] == 0) {
                break;
            } else {
                arrayLength++;
            }
        }
        int[] numbersCopy = Arrays.copyOf(player1.getNumber(), arrayLength);
        player1.clearArray(arrayLength);
        System.out.println("\nЧисла игрока " + player1.getName());
        for (int i = 0; i < numbersCopy.length; i += 2) {
            System.out.print(numbersCopy[i] + " ");
        }
        System.out.println("\nЧисла игрока " + player2.getName());
        for (int i = 1; i < numbersCopy.length; i += 2) {
            System.out.print(numbersCopy[i] + " ");
        }
    }

    public void guessNumber() {
        Random random = new Random();
        randomNum = random.nextInt(100) + 1;
        System.out.println("В игре участвуют " + player1.getName() + " и " + player2.getName());
        System.out.println("У вас есть по 10 попыток.");
        for (i = 0; i < 20; i++) {
            String name = i % 2 == 0 ? player1.getName() : player2.getName();
            System.out.println("\nИгрок " + name + " делает свой ход.");
            if (checkWinPlayer()) {
                System.out.print("\nИгрок " + name + " угадал число " + randomNum);
                System.out.println(" с " + (i / 2 + 1) + "-й попытки");
                break;
            }
            if (i >= 18) {
                System.out.println("\nУ игрока " + name + " закончились попытки");
            }
        }
        printArray();
    }
}