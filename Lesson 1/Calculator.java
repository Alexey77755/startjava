import java.util.Scanner;

public class Calculator {public static void main(String[] args) {
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
            if (sc.hasNextLine())  {
              s = sc.next();
                               }

             else {
                System.out.println("Похоже, вы ввели не верный знак. Введите снова.");
                }
            if(s.equals("+")){
             System.out.println(num1+num2);
            }
            if(s.equals("-")){
             System.out.println(num1-num2);
            }
            if(s.equals("*")){
             System.out.println(num1*num2);
            }
            if(s.equals("/")){
             System.out.println(num1/num2);
            }
            if(s.equals("^")){
             System.out.println(num1^num2);
            }
            if(s.equals("%")){
             System.out.println(num1%num2);
            }
            sc.close();
        }
    }
