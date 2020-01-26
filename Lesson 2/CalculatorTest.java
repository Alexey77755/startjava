import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        boolean isProgramWork = true;
        while(isProgramWork){
        System.out.print ("Введите первое число ");
        Scanner sc = new Scanner (System.in);

        if (sc.hasNextInt()) {
          calc1.setnum1(sc.nextInt());
        } else {
            System.out.println("Похоже, вы ввели не целое число. Введите снова.");
        }

        System.out.print ("Введите знак математической операции ");
        calc1.setsign(sc.next().charAt(0));

        System.out.print ("Введите второе число ");

        if (sc.hasNextInt()) {
            calc1.setnum2(sc.nextInt());
        } else {
            System.out.println("Похоже, вы ввели не целое число. Введите снова.");
        }

        switch (calc1.getsign()) {

            case '+': System.out.println(calc1.getnum1() + calc1.getnum2());
                    break;

            case '-': System.out.println(calc1.getnum1() - calc1.getnum2());
                    break;

            case '*': System.out.println(calc1.getnum1() * calc1.getnum2());
                    break;

            case '/': System.out.println(calc1.getnum1() / calc1.getnum2());
                    break;

            case '^': int result = 1;
                    for (int i = 1; i <= calc1.getnum2(); i++) {
                        result *= calc1.getnum1();
                    }
                    System.out.println(result);
                    break;

            case '%': System.out.println(calc1.getnum1() % calc1.getnum2());
                    break;

            default: System.out.println("Введеный знак не соответстует знаку математической операции. ");
                    break;
        }
        System.out.println("Хотите продолжить? [да/нет]: ");

        if(sc.next().equals("да")) {
            isProgramWork = true;
        } else {
            isProgramWork = false;
        }
        }
    }
}
