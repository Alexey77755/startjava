public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Hello, world");
        }

        int counter = 6;
        while (counter >= -6) {
            System.out.println(counter);
            counter-=2;
        }

       counter = 11;
       int sum = 0;
        do  {
            sum += counter;
            counter += 2;
        }
        while (counter <= 20);
        System.out.println(sum);
    }
}
