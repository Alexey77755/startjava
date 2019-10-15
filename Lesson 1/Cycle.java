public class MyFirstApp {
    public static void main(String[] args) {
        for (int i = 0; i<=20;i++) {
            System.out.println("Hello, world");
        }
        int j = 6;
        while (j>=-6) {
            System.out.println(j);
            j-=2;
        }
        int f = 11;
        do {
            int k = 0;
            while(f < 20) {
                k += f;
                f += 2;
            }

            System.out.println(k);
            }
        while (f<=20);
    }
}
