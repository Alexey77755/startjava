import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    private int randomNumber = (int) (Math.random() * 101);
    Scanner sc = new Scanner(System.in);

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
}
