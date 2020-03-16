package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String userResponse;
        String[] mathExpression;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Введите математическое выражение: ");
            mathExpression = sc.nextLine().split(" ");
            calc.calculate(mathExpression);
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                userResponse = sc.nextLine();
            } while(!userResponse.equals("да") && !userResponse.equals("нет"));
        } while(userResponse.equals("да"));
    }
}
