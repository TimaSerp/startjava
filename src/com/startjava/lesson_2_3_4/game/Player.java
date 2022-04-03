package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] nums = new int[10];
    private int arrayLength;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean setNum(int num, int attempt) {
        if (num < 1 || num > 100) {
            System.out.println("Ошибка. Введите число в диапазоне (0, 100]");
            return true;
        } else {
            nums[attempt] = num;
            return false;
        }
    }

    public int[] getNum() {
        arrayLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                break;
            } else {
                arrayLength++;
            }
        };
        return Arrays.copyOf(nums, arrayLength);
    }

    public void clearArray() {
        Arrays.fill(nums, 0, arrayLength, 0);
    }
}