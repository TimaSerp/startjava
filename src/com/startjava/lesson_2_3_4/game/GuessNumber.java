package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Scanner console = new Scanner(System.in);
    private int randomNum;
    private int playerNum;
    private Player player1;
    private Player player2;
    private boolean isStop;
    private int i;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void checkNum() {
        isStop = false;
        if(playerNum > randomNum) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if(playerNum < randomNum) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            isStop = true;
        }
    }

    public void checkWinPlayer1() {
        System.out.println("\nИгрок " + player1.getName() + " делает свой ход.");
        playerNum = console.nextInt();
        checkNum();
        player1.setNumbers1(playerNum, i);
        if (isStop) {
            System.out.print("\nИгрок " + player1.getName() + " угадал число " + randomNum);
            System.out.println(" с " + i + "-й попытки");
        } else if (i == 10) {
            System.out.println("У игрока " + player1.getName() + " закончились попытки");
        }
    }

    public void checkWinPlayer2() {
        System.out.println("\nИгрок " + player2.getName() + " делает свой ход.");
        playerNum = console.nextInt();
        checkNum();
        player2.setNumbers2(playerNum, i);
        if (isStop) {
            System.out.print("\nИгрок " + player2.getName() + " угадал число " + randomNum);
            System.out.println(" с " + (i + 1) + "-й попытки");
        } else if (i == 10) {
            System.out.println("У игрока " + player2.getName() + " закончились попытки");
        }
    }

    public void guessNumber() {
        Random random = new Random();
        randomNum = random.nextInt(100) + 1;
        System.out.println("В игре участвуют " + player1.getName() + " и "+ player2.getName());
        System.out.println("У вас есть по 10 попыток.");
        for(i = 0; i <= 10; i++) {
            checkWinPlayer1();
            if (isStop) { break; }
            checkWinPlayer2();
            if (isStop) { break; }
        }
        System.out.println("Числа игрока " + player1.getName());
        player1.printArray1();
        System.out.println("\nЧисла игрока " + player2.getName());
        player2.printArray2();
    }
}