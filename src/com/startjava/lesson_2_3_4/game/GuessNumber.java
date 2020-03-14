package com.startjava.lesson_2_3_4.game;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int randomNumber = (int) (Math.random() * 101);
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    String player1Choice;
    String player2Choice;


    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void setPlayer1Choice(String player1Choice) {

        this.player1Choice = player1Choice;
    }

    public String getPlayer1Choice() {
        return player1Choice;
    }

    public void setPlayer2Choice(String player2Choice) {
        this.player2Choice = player2Choice;
    }

    public String getPlayer2Choice() {
        return player2Choice;
    }

    public void start() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Первый игрок введите число ");
            player1.setNumber(scan.nextInt());
            player1.setEnteredNumber(i);
            if(victory(player1, i)) {
                break;
            }

            System.out.println("Второй игрок введите число ");
            player2.setNumber(scan.nextInt());
            player2.setEnteredNumber(i);
            if(victory(player2, i)) {
                break;
            }

            if (i == 9) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                System.out.println("У " + player2.getName() + " закончились попытки");
            }
        }
    }


    private boolean victory(Player gamer, int index) {
        if (comparesNumber(gamer.getNumber())) {
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


    public void gameEnding() {
        do {
            System.out.println("Хотите продолжить? [да/нет]: ");
            System.out.println("Ответ первого игрока: ");
            player1Choice = scan.next();
            System.out.println("Ответ второго игрока: ");
            player2Choice = scan.next();
            if(player1Choice.equals("да") && player2Choice.equals("да")) {
                System.out.println("Оба игрока хотят продолжать. ");
                break;
            } else if(player1Choice.equals("нет") && player2Choice.equals("нет")) {
                System.out.println("Оба игрока не хотят продолжать.Игра завершается.");
                break;
            } else if(player1Choice.equals("нет") && player2Choice.equals("да")) {
                System.out.println("Первый игрок не хочет продолжать. Введите имя игрока желающего его заменить.");
                player1.setName(scan.next());
                player1Choice = "да";
                break;
            } else if(player1Choice.equals("да") && player2Choice.equals("нет")) {
                System.out.println("Второй игрок не хочет продолжать. Введите имя игрока желающего его заменить.");
                player2.setName(scan.next());
                player2Choice = "да";
                break;
            } else {
                continue;
            }
        } while(true);
    }
}
