package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Scanner console = new Scanner(System.in);
    private int randomNum;
    private int playerNum;
    private Player player1;
    private Player player2;
    private boolean isWin;
    private int i;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean checkNum() {
        if (playerNum == randomNum) {
            return true;
        }
        String answer = playerNum > randomNum ? "больше" : "меньше";
        System.out.print("Данное число " + answer + " того, что загадал компьютер");
        return false;
    }

    public void checkWinPlayer1() {
        System.out.println("\nИгрок " + player1.getName() + " делает свой ход.");
        playerNum = console.nextInt();
        player1.setNumbers1(playerNum, i);
        if (checkNum()) {
            System.out.print("\nИгрок " + player1.getName() + " угадал число " + randomNum);
            System.out.println(" с " + i + "-й попытки");
            isWin = true;
        } else if (i == 9) {
            System.out.println("У игрока " + player1.getName() + " закончились попытки");
        }
    }

    public boolean checkWinPlayer2() {
        if (isWin) {
            return true;
        } else {
            System.out.println("\nИгрок " + player2.getName() + " делает свой ход.");
            playerNum = console.nextInt();
            player2.setNumbers2(playerNum, i);
            if (checkNum()) {
                System.out.print("\nИгрок " + player2.getName() + " угадал число " + randomNum);
                System.out.println(" с " + (i + 1) + "-й попытки");
                return true;
            } else if (i == 9) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
                return true;
            }
            return false;

        }
    }

        public void guessNumber () {
            Random random = new Random();
            randomNum = random.nextInt(100) + 1;
            System.out.println("В игре участвуют " + player1.getName() + " и " + player2.getName());
            System.out.println("У вас есть по 10 попыток.");
            for (i = 0; i < 10; i++) {
                checkWinPlayer1();
                if (checkWinPlayer2()) {
                    break;
                }
            }
            System.out.println("Числа игрока " + player1.getName());
            player1.printArray1();
            System.out.println("\nЧисла игрока " + player2.getName());
            player2.printArray2();
        }
}