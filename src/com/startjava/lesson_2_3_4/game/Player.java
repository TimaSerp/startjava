package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers1 = new int[10];
    private int[] numbers2 = new int[10];

    public String getName() {
        return name;
    }

    public void setNumbers1(int num, int i) {
        numbers1[i] = num;
    }

    public void setNumbers2(int num, int i) {
        numbers2[i] = num;
    }

    public Player(String name) {
        this.name = name;
    }

    public void printArray1() {
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] == 0) {
                int[] numbers1Copy = Arrays.copyOf(numbers1, i);
                for (int number: numbers1Copy) {
                    System.out.print(number + " ");
                }
                Arrays.fill(numbers1, 0, i, 0);
                break;
            }
        }
    }

    public void printArray2() {
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] == 0) {
                int[] numbers2Copy = Arrays.copyOf(numbers2, i);
                for (int number: numbers2Copy) {
                    System.out.print(number + " ");
                }
                Arrays.fill(numbers2, 0, i, 0);
                break;
            }
        }
    }


}