import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
            System.out.print ("Введите первое число арифметического выражения ");
            Scanner sc = new Scanner (System.in);

            if (sc.hasNextInt()) {
                num1 = sc.nextInt();
            } else {
                System.out.println("Похоже, вы ввели не целое число. Введите снова.");
            }
            System.out.print ("Введите второе число арифметического выражения ");

            if (sc.hasNextInt()) {
                num2 = sc.nextInt();
            } else {
                System.out.println("Похоже, вы ввели не целое число. Введите снова.");
            }
            System.out.print ("Введите знак математической операции ");
        String s ="";
            if (sc.hasNextLine()) {
                s = sc.next();
            } else {
                System.out.println("Похоже, вы ввели не верный знак. Введите снова.");
            }
            if (s.equals("+")) {
                System.out.println(num1 + num2);
            } else if(s.equals("-")) {
                System.out.println(num1 - num2);
            } else if(s.equals("*")) {
                System.out.println(num1 * num2);
            } else if(s.equals("/")) {
                System.out.println(num1 / num2);
            } else if(s.equals("^")) {
                int result = 1;
                for (int i=1; i<=num2; i++) {
                    result = result*num1;
                }
                System.out.println(result);
            } else if(s.equals("%")) {
                System.out.println(num1 % num2);
            } else {
                System.out.println("Введеный знак не соответстует знаку математической операции. Введите снова.");
            }
            sc.close();
        }
    }
