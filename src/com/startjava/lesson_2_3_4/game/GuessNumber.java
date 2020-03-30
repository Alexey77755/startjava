package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int randomNumber = (int) (Math.random() * 101);
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;


    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Первый игрок введите число ");
            enterNumber(player1,i);
            if(guessed(player1, i)) {
                System.out.println(Arrays.toString(player1.getEnteredNumbers(i)));
                System.out.println(Arrays.toString(player2.getEnteredNumbers(i - 1)));
                player1.resettingArray(i);
                player2.resettingArray(i-1);
                break;
            }
            System.out.println("Второй игрок введите число ");
            enterNumber(player2,i);
            if(guessed(player2, i)) {
                System.out.println(Arrays.toString(player1.getEnteredNumbers(i)));
                System.out.println(Arrays.toString(player2.getEnteredNumbers(i)));
                player1.resettingArray(i);
                player2.resettingArray(i);
                break;
            }
            if (i == 9) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                System.out.println("У " + player2.getName() + " закончились попытки");
                player1.resettingArray(i);
                player2.resettingArray(i);
            }
        }
    }

    private void enterNumber(Player player, int index) {
        player.setEnteredNumber(scan.nextInt(),index);
    }

    private boolean guessed(Player gamer, int index) {
        if (compareNumbers(gamer.getEnteredNumbers(index)[index])) {
            System.out.println("Игрок " + gamer.getName() + " угадал число " + gamer.getEnteredNumbers(index)[index] + " с " + (index + 1) + " попытки");
            return true;
        }
        return false;
    }

    private boolean compareNumbers(int userNumber) {
        if (userNumber > randomNumber) {
            System.out.print("Ваше число больше\n");
        } else if (userNumber < randomNumber) {
            System.out.print("Ваше число меньше\n");
        } else {
            return true;
        }
        return false;
    }
}
