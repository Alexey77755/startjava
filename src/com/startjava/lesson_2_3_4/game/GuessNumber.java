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
            enterNumber(player1);
            if (compareNumbers(player1, i)) {
                printsAttempts(player1);
                printsAttempts(player2);
                player1.resetEnteredNumbers();
                player2.resetEnteredNumbers();
                break;
            }

            enterNumber(player2);
            if (compareNumbers(player2, i)) {
                printsAttempts(player1);
                printsAttempts(player2);
                player1.resetEnteredNumbers();
                player2.resetEnteredNumbers();
                break;
            }

            if (i == 9) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                System.out.println("У " + player2.getName() + " закончились попытки");
                player1.resetEnteredNumbers();
                player2.resetEnteredNumbers();
            }
        }
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + " введите число ");
        player.setEnteredNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player, int index) {
        if (player.getEnteredNumbers()[index] > randomNumber) {
            System.out.print("Ваше число больше\n");
        } else if (player.getEnteredNumbers()[index] < randomNumber) {
            System.out.print("Ваше число меньше\n");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getEnteredNumbers()[index] + " с " + (index + 1) + " попытки");
            return true;
        }
        return false;
    }

    private void printsAttempts(Player player) {
        System.out.println(Arrays.toString(player.getEnteredNumbers()));
    }
}
