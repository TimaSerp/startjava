package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int num, int i) {
        if (num < 1 || num > 100) {
            System.out.println("Ошибка. Введите число в диапазоне (0, 100]");
        } else {
            numbers[i] = num;
        }
    }

    public int[] getNumber() {
        int[] numbers1 = Arrays.copyOf(numbers, numbers.length);
        return numbers1;
    }

    public void clearArray(int i) {
        Arrays.fill(numbers, 0, i, 0);
    }
}