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
            if(enterNumber(player1, i)) {
                System.out.println(Arrays.toString(player2.getEnteredNumbers(i - 1)));
                Arrays.fill(player2.getEnteredNumbers(),0,i,0);
                break;
            }
            if(enterNumber(player2, i)) {
                System.out.println(Arrays.toString(player1.getEnteredNumbers(i)));
                Arrays.fill(player1.getEnteredNumbers(),0,i,0);
                break;
            }

            if (i == 9) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                System.out.println("У " + player2.getName() + " закончились попытки");
            }
        }

    }

    private boolean enterNumber(Player player, int index) {
        if (player.equals(player1)) {
            System.out.println("Первый игрок введите число ");
        } else {
            System.out.println("Второй игрок введите число ");
        }
        player.setEnteredNumbers(scan.nextInt(),index);
        if(guessed(player, index)) {
            System.out.println(Arrays.toString(player.getEnteredNumbers(index)));
            Arrays.fill(player.getEnteredNumbers(),0,index+1,0);
            return true;
        }
        return false;
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
