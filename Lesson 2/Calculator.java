import java.util.Scanner;

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

    public void definesSign() {
        switch (sign) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '^':
                int result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                System.out.println(result);
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
