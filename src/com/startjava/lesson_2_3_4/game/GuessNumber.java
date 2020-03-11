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
        for(int i = 0; i < 10; i++) {
            System.out.println("Первый игрок введите число ");
            player1.setNumber(scan.nextInt());
            player1.setEnteredNumbers(i);
            if(comparesNumber(player1.getNumber())) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getEnteredNumbers()[i] +" с " + (i+1) + " попытки");
                System.out.println(player1.arrayToString(i));
                System.out.println(player2.arrayToString(i-1));
                break;
            }
            System.out.println("Второй игрок введите число ");
            player2.setNumber(scan.nextInt());
            player2.setEnteredNumbers(i);
            if(comparesNumber(player2.getNumber())) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getEnteredNumbers()[i] +" с " + (i+1) + " попытки");
                System.out.println(player1.arrayToString(i));
                System.out.println(player2.arrayToString(i));
                break;
            }
        }
        System.out.println("У " + player1.getName() + " закончились попытки");
        System.out.println("У " + player2.getName() + " закончились попытки");

    }

    private boolean comparesNumber(int userNumber) {
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
