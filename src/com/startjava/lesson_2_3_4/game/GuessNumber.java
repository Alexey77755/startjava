package com.startjava.lesson_2_3.game;
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
        while(true) {
            System.out.println("Первый игрок введите число ");
            player1.setNumber(scan.nextInt());
            if(comparesNumber(player1.getNumber())) {
                System.out.println("Первый игрок угадал число");
                break;
            }
            System.out.println("Второй игрок введите число ");
            player2.setNumber(scan.nextInt());
            if(comparesNumber(player2.getNumber())) {
                System.out.println("Второй игрок угадал число");
                break;
            }
        }
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
