package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];
    private int attempts;

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEnteredNumber(int number) {
        this.enteredNumbers[attempts] = number;
        attempts++;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempts);
    }

    public void resetEnteredNumbers() {
        Arrays.fill(enteredNumbers, 0, attempts, 0);
        attempts = 0;
    }
}
