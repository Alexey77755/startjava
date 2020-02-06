public class JaegerTest {

    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger("A-50","Mark-1","Australia","TY/Escape Hatch","Arbiter Tac-Conn","XIG Supercell Chamber","Herc Hansen, Chuck Hansen",70.5f,3.2f,51,21,33);

        strikerEureka.attackKaiju();
        strikerEureka.move();
        strikerEureka.drift();
        strikerEureka.setWeight(5.1f);

        System.out.println(strikerEureka.getOrigin());
        System.out.println(strikerEureka.getEquipment());
        System.out.println(strikerEureka.getPilots());

        Jaeger gipsyDanger = new Jaeger("S-300");
        gipsyDanger.attackKaiju();
        gipsyDanger.move();
        gipsyDanger.drift();
        gipsyDanger.setHeight(61.1f);

        System.out.println(gipsyDanger.getMark());
        System.out.println(gipsyDanger.getHeight());
        System.out.println(gipsyDanger.getArmor());
    }
}
