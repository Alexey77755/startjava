import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String player1Choice;
        String player2Choice;
        Scanner sc = new Scanner(System.in);

        GuessNumber game = new GuessNumber();
        System.out.println("Введите имя первого игрока ");
        game.mark.setName(sc.next());

        Player ivan = new Player();
        System.out.println("Введите имя второго игрока ");
        game.ivan.setName(sc.next());

        do {
            game.enterValues();

            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                System.out.println("Ответ первого игрока: ");
                player1Choice = sc.next();
                System.out.println("Ответ второго игрока: ");
                player2Choice = sc.next();
                if(player1Choice.equals("да")) {
                    System.out.println("Первый игрок хочет продолжать. ");
                } else if(player1Choice.equals("нет")) {
                    System.out.println("Первый игрок не хочет продолжать. Игра завершается.");
                    break;
                } else {
                    continue;
                }
                if(player2Choice.equals("да")) {
                    System.out.println("Второй игрок хочет продолжать. Игра продолжится.");
                } else if(player2Choice.equals("нет")) {
                    System.out.println("Второй игрок не хочет продолжать. Игра завершается.");
                    break;
                } else {
                    continue;
                }
            } while(!player1Choice.equals("да") && !player2Choice.equals("да"));
        } while(player1Choice.equals("да") && player2Choice.equals("да"));
    }
}
