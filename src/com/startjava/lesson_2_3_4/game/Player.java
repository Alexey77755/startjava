package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] enteredNumber = new int[10];

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

    public void setEnteredNumber(int index) {

        this.enteredNumber[index] = number;
    }

    public int[] getEnteredNumber(int index) {

        return Arrays.copyOf(enteredNumber, index+1);
    }
}
