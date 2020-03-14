package com.startjava.lesson_2_3_4.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("У вас 10 попыток");
        System.out.println("Введите имя первого игрока ");
        Player player1 = new Player(sc.next());

        System.out.println("Введите имя второго игрока ");
        Player player2 = new Player(sc.next());
        GuessNumber game = new GuessNumber(player1,player2);

        do {
            game.start();
            game.gameEnding();

        } while(game.getPlayer1Choice().equals("да") && game.getPlayer2Choice().equals("да"));
    }
}
