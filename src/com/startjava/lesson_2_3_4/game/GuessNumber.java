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
            player1.setEnteredNumber(scan.nextInt(),i);
            if(guessed(player1, i)) {
                break;
            }

            System.out.println("Второй игрок введите число ");
            player2.setEnteredNumber(scan.nextInt(),i);
            if(guessed(player2, i)) {
                break;
            }

            if (i == 9) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                System.out.println("У " + player2.getName() + " закончились попытки");
            }
        }
    }


    private boolean guessed(Player gamer, int index) {
        if (compareNumbers(gamer.getEnteredNumber(index)[index])) {
            if (gamer.equals(player1)) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getEnteredNumber(index)[index] + " с " + (index + 1) + " попытки");
                System.out.println(Arrays.toString(player1.getEnteredNumber(index)));
                System.out.println(Arrays.toString(player2.getEnteredNumber(index - 1)));
                return true;
            } else {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getEnteredNumber(index)[index] + " с " + (index + 1) + " попытки");
                System.out.println(Arrays.toString(player1.getEnteredNumber(index)));
                System.out.println(Arrays.toString(player2.getEnteredNumber(index)));
                return true;
            }
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
