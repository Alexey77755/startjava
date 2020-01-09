import java.util.Scanner;
import java.lang.Math;

public class MyFirstGame {
    public static void main(String[] args) {
        int userNumber = 0;
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);
        do {
            System.out.print("Введите ваше число: ");
            userNumber = sc.nextInt();
            if (userNumber > randomNumber) {
                System.out.print("Ваше число больше\n");
            } else if (userNumber < randomNumber) {
                System.out.print("Ваше число меньше\n");
            }
        } while (randomNumber != userNumber);
        System.out.print("Верное число))");
   }
}
