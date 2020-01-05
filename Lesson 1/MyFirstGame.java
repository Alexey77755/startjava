import java.util.Scanner;
import java.lang.Math;

public class MyFirstGame {
    public static void main(String[] args) {
    int numb = 0;
    Scanner sc = new Scanner(System.in);
    int random_number = (int) (Math.random() * 101);
    do {
        System.out.print("Введите ваше число: ");
        numb = sc.nextInt();
        if (numb > random_number) {
            System.out.print("Ваше число больше\n");
        } else if (numb < random_number) {
            System.out.print("Ваше число меньше\n");
        } else {
            System.out.print("Верное число))");
        }
        }
    while (random_number != numb);
   }
}
