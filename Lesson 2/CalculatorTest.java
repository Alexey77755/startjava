import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        boolean isProgramWork = true;
        Scanner sc = new Scanner (System.in);
        while(isProgramWork) {
            System.out.print ("Введите первое число ");
            if (sc.hasNextInt()) {
              calc1.setNum1(sc.nextInt());
            } else {
            System.out.println("Похоже, вы ввели не целое число. Введите снова.");
            }

            System.out.print ("Введите знак математической операции ");
            calc1.setSign(sc.next().charAt(0));

            System.out.print("Введите второе число ");
            if (sc.hasNextInt()) {
            calc1.setNum2(sc.nextInt());
            } else {
            System.out.println("Похоже, вы ввели не целое число. Введите снова.");
            }
            calc1.mathOperation();

            System.out.println("Хотите продолжить? [да/нет]: ");

            if(sc.next().equals("да")) {
                isProgramWork = true;
            } else {
                isProgramWork = false;
            }
        }
    }
}
