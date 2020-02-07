import java.util.Scanner;

public class GuessNumber {
    private int randomNumber = (int) (Math.random() * 101);
    Scanner scan = new Scanner(System.in);
    Player mark = new Player();
    Player ivan = new Player();

    public boolean comparesNumber(int userNumber) {
        if (userNumber > randomNumber) {
            System.out.print("Ваше число больше\n");
            return false;
        } else if (userNumber < randomNumber) {
            System.out.print("Ваше число меньше\n");
            return false;
        } else {
            return true;
        }
    }
    public void enterValues() {
        while(true) {
            System.out.println("Первый игрок введите число ");
            mark.setNumber(scan.nextInt());
            if(comparesNumber(mark.getNumber())) {
                System.out.println("Первый игрок угадал число");
                break;
            }
            System.out.println("Второй игрок введите число ");
            ivan.setNumber(scan.nextInt());
            if(comparesNumber(ivan.getNumber())) {
                System.out.println("Второй игрок угадал число");
                break;
            }
        }
    }
}