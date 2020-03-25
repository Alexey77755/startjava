package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEnteredNumbers(int number, int index) {
        this.enteredNumbers[index] = number;
    }

    public int[] getEnteredNumbers(int index) {
        return Arrays.copyOf(enteredNumbers, index + 1);
    }
    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

}
