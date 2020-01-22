
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.isSex = false;
        wolf1.nickname = "Tim";
        wolf1.weight = 50.1f;
        wolf1.age = 3;
        wolf1.color = "Gray";

        System.out.println(wolf1.isSex);
        System.out.println(wolf1.nickname);
        System.out.println(wolf1.weight);
        System.out.println(wolf1.age);
        System.out.println(wolf1.color);

         wolf1.go();
         wolf1.sit();
         wolf1.run();
         wolf1.howl();
         wolf1.hunt();
    }
}
