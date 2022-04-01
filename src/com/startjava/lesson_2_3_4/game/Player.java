package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[20];

    public String getName() {
        return name;
    }

    public void setNumber(int num, int i) {
        numbers[i] = num;
    }

    public int[] getNumber() {
        return numbers;
    }

    public Player(String name) {
        this.name = name;
    }

    public void clearArray(int i) { Arrays.fill(numbers, 0, i, 0); }
}