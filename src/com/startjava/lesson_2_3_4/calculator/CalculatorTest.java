package com.startjava.lesson_2_3_4.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String userResponse;
        String [] mathExpression;
        Scanner sc = new Scanner (System.in);
        boolean isFlag = true;


        do {
            userResponse = " ";
            System.out.print("Введите математическое выражение: ");
            mathExpression = sc.nextLine().split(" ");
            for(int i = 0; i < mathExpression.length; i++) {
                if (i != 1){
                    try {
                        if(i < 1) {
                        calc.setNum1(Integer.parseInt(mathExpression[i]));
                    } else {
                        calc.setNum2(Integer.parseInt(mathExpression[i]));
                    }
                    } catch (NumberFormatException e) {
                            System.out.println("Похоже, вы ввели не целое число.");
                            isFlag = false;
                            break;
                    }
                } else {
                    calc.setSign(mathExpression[i].charAt(0));
                    continue;
                }
            }
            if(isFlag) {
                calc.calculate();
            }
            while(!userResponse.equals("да") && !userResponse.equals("нет")) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                userResponse = sc.nextLine();
            }
            isFlag = true;
        } while(userResponse.equals("да"));
    }
}
