import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player mark = new Player();
        System.out.println("Введите имя первого игрока ");
        mark.setName(sc.next());

        Player ivan = new Player();
        System.out.println("Введите имя второго игрока ");
        ivan.setName(sc.next());

        GuessNumber game = new GuessNumber();

        do {
            while(true) {
                System.out.println("Первый игрок введите число ");
                mark.setNumber(sc.nextInt());
                if(game.comparesNumber(mark.getNumber())) {
                    System.out.println("Первый игрок угадал число");
                    break;
                }
                System.out.println("Второй игрок введите число ");
                ivan.setNumber(sc.nextInt());
                if(game.comparesNumber(ivan.getNumber())) {
                    System.out.println("Второй игрок угадал число");
                    break;
                }
            }

            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                System.out.println("Ответ первого игрока: ");
                mark.setPlayerChoice(sc.next());
                System.out.println("Ответ второго игрока: ");
                ivan.setPlayerChoice(sc.next());
                if(mark.getPlayerChoice().equals("да")) {
                    System.out.println("Первый игрок хочет продолжать. ");
                } else if(mark.getPlayerChoice().equals("нет")) {
                    System.out.println("Первый игрок не хочет продолжать. Игра завершается.");
                    break;
                } else {
                    continue;
                }
                if(ivan.getPlayerChoice().equals("да")) {
                    System.out.println("Второй игрок хочет продолжать. Игра продолжится.");
                } else if(ivan.getPlayerChoice().equals("нет")) {
                    System.out.println("Второй игрок не хочет продолжать. Игра завершается.");
                    break;
                } else {
                    continue;
                }

            } while(!mark.getPlayerChoice().equals("да") && !ivan.getPlayerChoice().equals("да"));
        } while(mark.getPlayerChoice().equals("да") && ivan.getPlayerChoice().equals("да"));
    }
}
