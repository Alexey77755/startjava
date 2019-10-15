public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 0;
        boolean maleGender = true;
        float height = 1.0;
        String name = "Alexey";
        char c = str.charAt(0);

        if (age > 20) {
            System.out.println("Ok");
        }
        if (maleGender) {
            System.out.println("Ok");
        }
        if (maleGender == false) {
            System.out.println("Super");
        }
        if (height < 1.80) {
            System.out.println("dwarf");
        } else {
            System.out.println("giant");
        }
        if (c == 'M') {
            System.out.println("MMM");
        } else if (c == 'I') {
            System.out.println("III");
        } else {
            System.out.println("RRR");
        }

    }
}
