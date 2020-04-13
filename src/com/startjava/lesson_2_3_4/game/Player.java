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

    public void setAttempts(int attempts) {

        this.attempts = attempts;
    }


    public void setEnteredNumber(int number, int index) {
        this.enteredNumbers[index] = number;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempts + 1);
    }

    public void resettingArray() {
        Arrays.fill(enteredNumbers, 0, attempts + 1, 0);
    }
}
