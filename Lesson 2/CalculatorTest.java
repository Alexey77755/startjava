public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        boolean isProgramWork = true;
        boolean isNumber1 = true;
        String buffer;
        Scanner sc = new Scanner (System.in);

        while(isProgramWork) {
            System.out.print ("Введите первое число ");
            if (sc.hasNextInt()) {
                calc.setNum1(sc.nextInt());
                isNumber1 = false;
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
            calc.definesSign();
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                buffer = sc.next();
                if(buffer.equals("да") ) {
                    isProgramWork = true;
                } else if(buffer.equals("нет")) {
                    isProgramWork = false;
                } else {
                System.out.println("Похоже, вы ввели не верное значение.");
                }
            } while(!buffer.equals("да") & !buffer.equals("нет"));
        }
    }
}
