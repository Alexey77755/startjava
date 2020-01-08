import java.util.Scanner;
import java.lang.Math;

public class MyFirstGame {
    public static void main(String[] args) {
        int numberUser = 0;
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);
        do {
            System.out.print("Введите ваше число: ");
            numberUser = sc.nextInt();
            if (numberUser > randomNumber) {
                System.out.print("Ваше число больше\n");
            } else if (numberUser < randomNumber) {
                System.out.print("Ваше число меньше\n");
            }
        }
        while (randomNumber != numberUser);
        System.out.print("Верное число))");
   }
}
