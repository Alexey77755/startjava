
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setSex(false);
        wolf1.setNickname("Tim");
        wolf1.setWeight(50.1f);
        wolf1.setAge(3);
        wolf1.setColor("Gray");

        System.out.println(wolf1.getSex());
        System.out.println(wolf1.getNickname());
        System.out.println(wolf1.getWeight());
        System.out.println(wolf1.getAge());
        System.out.println(wolf1.getColor());

        wolf1.go();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}
