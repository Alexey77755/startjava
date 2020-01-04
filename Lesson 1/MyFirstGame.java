import java.util.Scanner;
import java.lang.Math;

public class MyFirstGame {
    public static void main(String[] args) {
      int UserN=0;
        Scanner sc = new Scanner(System.in);
        int random_number = (int) (Math.random() * 100);
        do {
            System.out.print("Введите ваше число: ");
            UserN = sc.nextInt();
            if (UserN>random_number) {
                System.out.print ("Ваше число больше\n");
            } else if (UserN<random_number) {
                System.out.print ("Ваше число меньше\n");
            } else {
                System.out.print ("Верное число))");
            }
          }
          while (random_number != UserN );
   }
}
