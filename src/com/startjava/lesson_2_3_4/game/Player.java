package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] nums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean setNum(int num, int attempts) {
        if (num < 1 || num > 100) {
            return false;
        }
        nums[attempts] = num;
        return true;
    }

    public int[] getNums(int attempts) {
        return Arrays.copyOf(nums, attempts + 1);
    }

    public void clearArray(int attempts) {
        Arrays.fill(nums, 0, attempts + 1, 0);
    }
}