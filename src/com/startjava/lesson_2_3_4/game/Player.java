package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
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

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setEnteredNumbers(int index) {
        this.enteredNumbers[index] = number;
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

    public String arrayToString(int index) {
        int[] numbersCopy = Arrays.copyOf(enteredNumbers, index+1);
        return Arrays.toString(numbersCopy);
    }
}
