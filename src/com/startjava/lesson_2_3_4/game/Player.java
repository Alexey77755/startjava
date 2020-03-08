package com.startjava.lesson_2_3_4.game;
import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int [] usNumber = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() { return number; }

    public String getName() {
        return name;
    }

    public void setUsNumber(int index) {
        this.usNumber[index] = number;
    }

    public int[] getUsNumber() {
        return usNumber;
    }

    public String arrayToString(int index) {
        int [] numbersCopy = Arrays.copyOf(usNumber, index+1);
        return Arrays.toString(numbersCopy);
    }
}
