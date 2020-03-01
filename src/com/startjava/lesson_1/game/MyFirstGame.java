package com.startjava.lesson_1.game;
import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);
        int t;
        while (true) {
            System.out.println("Введите число ");
            t = scan.nextInt();
            if (t > randomNumber) {
                System.out.print("Ваше число больше\n");
            } else if (t < randomNumber) {
                System.out.print("Ваше число меньше\n");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
        }
    }
}