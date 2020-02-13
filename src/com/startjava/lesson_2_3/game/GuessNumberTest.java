package com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String player1Choice;
        String player2Choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя первого игрока ");
        Player player1 = new Player(sc.next());

        System.out.println("Введите имя второго игрока ");
        Player player2 = new Player(sc.next());

        GuessNumber game = new GuessNumber(player1,player2);

        do {
            game.start();

            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                System.out.println("Ответ первого игрока: ");
                player1Choice = sc.next();
                System.out.println("Ответ второго игрока: ");
                player2Choice = sc.next();
                if(player1Choice.equals("да") && player2Choice.equals("да")) {
                    System.out.println("Оба игрока хотят продолжать. ");
                    break;
                } else if(player1Choice.equals("нет") && player2Choice.equals("нет")) {
                    System.out.println("Оба игрока не хотят продолжать. Игра завершается.");
                    break;
                } else if(player1Choice.equals("нет") && player2Choice.equals("да")) {
                    System.out.println("Первый игрок не хочет продолжать. Введите имя игрока желающего его заменить.");
                    player1.setName(sc.next());
                    player1Choice = "да";
                    break;
                } else if(player1Choice.equals("да") && player2Choice.equals("нет")) {
                    System.out.println("Второй игрок не хочет продолжать. Введите имя игрока желающего его заменить.");
                    player2.setName(sc.next());
                    player2Choice = "да";
                    break;
                } else {
                    continue;
                }
            } while(true);
        } while(player1Choice.equals("да") && player2Choice.equals("да"));
    }
}
