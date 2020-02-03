import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String userResponse = "да";
        Scanner sc = new Scanner (System.in);

        do {
            System.out.print("Введите первое число ");
            if (sc.hasNextInt()) {
                calc.setNum1(sc.nextInt());
            } else {
                System.out.println("Похоже, вы ввели не целое число. Введите снова.");
            }

            System.out.print ("Введите знак математической операции ");
            calc.setSign(sc.next().charAt(0));

            System.out.print("Введите второе число ");
            if (sc.hasNextInt()) {
                calc.setNum2(sc.nextInt());
            } else {
                System.out.println("Похоже, вы ввели не целое число. Введите снова.");
            }
            calc.calculate();

            System.out.println("Хотите продолжить? [да/нет]: ");
            userResponse = sc.next();
            if(userResponse.equals("да") ) {
                continue;
            } else if(userResponse.equals("нет")) {
                break;
            } else {
                System.out.println("Вы ввели не верное значение. Программа будет завершена");
                break;
            }
        } while(true);
    }
}
