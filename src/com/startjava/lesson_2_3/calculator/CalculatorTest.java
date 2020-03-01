package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String userResponse;
        String [] mathematicalExpression;
        Scanner sc = new Scanner (System.in);
        boolean isFlag = true;


        do {
            userResponse = " ";
            System.out.print("Введите математическое выражение: ");
            mathematicalExpression=sc.nextLine().split(" ");
            for(int i = 0;i<mathematicalExpression.length;i++) {
                if (i == 0) {
                    try {
                        calc.setNum1(Integer.parseInt(mathematicalExpression[i]));
                    } catch (NumberFormatException e) {
                        System.out.println("Похоже, вы ввели не целое число.");
                        isFlag = false;
                        break;
                    }
                }
                if (i == 1) {
                    calc.setSign(mathematicalExpression[i].charAt(0));
                    continue;
                }
                if (i == 2) {
                    try {
                        calc.setNum2(Integer.parseInt(mathematicalExpression[i]));
                    } catch (NumberFormatException e) {
                        System.out.println("Похоже, вы ввели не целое число.");
                        isFlag = false;
                        break;
                    }
                }
            }
            if(isFlag) {
                calc.calculate();
            }
            while(!userResponse.equals("да") && !userResponse.equals("нет")) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                userResponse = sc.nextLine();
            }

        } while(userResponse.equals("да"));
    }
}
