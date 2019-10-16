public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 0;
        if (age > 20) {
            System.out.println("Ok");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("Ok");
        }
        if (!isMale ) {
            System.out.println("Super");
        }

        float height = 1.0;
        if (height < 1.80) {
            System.out.println("dwarf");
        } else {
            System.out.println("giant");
        }

        String name = "Alexey";
        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("MMM");
        } else if (firstLetterName == 'I') {
            System.out.println("III");
        } else {
            System.out.println("RRR");
        }
    }
}
