public class JaegerTest {

    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger();
        strikerEureka.setModelName("A-50");
        strikerEureka.setMark("Mark-1");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setEquipment("TY/Escape Hatch");
        strikerEureka.setOpSystem("Arbiter Tac-Conn");
        strikerEureka.setEnergyCore("XIG Supercell Chamber");
        strikerEureka.setPilots("Herc Hansen, Chuck Hansen");
        strikerEureka.setHeight(70.5f);
        strikerEureka.setWeight(3.2f);
        strikerEureka.setSpeed(51);
        strikerEureka.setStrength(21);
        strikerEureka.setArmor(33);

        strikerEureka.attackKaiju();
        strikerEureka.move();
        strikerEureka.drift();
        strikerEureka.setWeight(5.1f);

        System.out.println(strikerEureka.getOrigin());
        System.out.println(strikerEureka.getEquipment());
        System.out.println(strikerEureka.getPilots());

        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("S-300");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("United States of America");
        gipsyDanger.setEquipment("  Jaeger A.I.");
        gipsyDanger.setOpSystem("Blue Spark 4.1");
        gipsyDanger.setEnergyCore("Arc-9 reactor");
        gipsyDanger.setPilots("Yancy Becket, Raleigh Becket, Mako Mori");
        gipsyDanger.setHeight(60.1f);
        gipsyDanger.setWeight(2.9f);
        gipsyDanger.setSpeed(70);
        gipsyDanger.setStrength(19);
        gipsyDanger.setArmor(28);

        gipsyDanger.attackKaiju();
        gipsyDanger.move();
        gipsyDanger.drift();
        gipsyDanger.setHeight(61.1f);

        System.out.println(gipsyDanger.getMark());
        System.out.println(gipsyDanger.getHeight());
        System.out.println(gipsyDanger.getArmor());
    }

}
