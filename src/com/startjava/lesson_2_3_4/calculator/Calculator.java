package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public int getNum1() {

        return num1;
    }

    public void setNum1(int num1) {

        this.num1 = num1;
    }

    public int getNum2() {

        return num2;
    }

    public void setNum2(int num2) {

        this.num2 = num2;
    }

    public char getSign() {

        return sign;
    }

    public void setSign(char sign) {

        this.sign = sign;
    }


    public boolean gettingValues(String[] arrayValues) {
        for(int i = 0; i < arrayValues.length; i++) {
            if (i != 1) {
                try {
                    if(i < 1) {
                        num1 = Integer.parseInt(arrayValues[i]);
                    } else {
                        num2 = Integer.parseInt(arrayValues[i]);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Похоже, вы ввели не целое число.");
                    return false;
                }
            } else {
                sign = arrayValues[i].charAt(0);
                continue;
            }
        }
        return true;
    }

    public void calculate() {
        switch (sign) {
            case '+':
                System.out.println(Math.addExact(num1, num2));
                break;
            case '-':
                System.out.println(Math.subtractExact(num1,num2));
                break;
            case '*':
                System.out.println(Math.multiplyExact(num1, num2));
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '^':
                System.out.println(Math.pow(num1,num2));
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Введеный знак не соответстует знаку математической операции. ");
                break;
        }
    }
}
