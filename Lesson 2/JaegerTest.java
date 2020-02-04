public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private String equipment;
    private String opSystem;
    private String energyCore;
    private String pilots;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(){

    }

    public Jaeger(String modelName) {
        this.modelName = modelName;
    }
    public Jaeger(String modelName, String mark) {
        this.modelName = modelName;
        this.mark = mark;
    }

    public Jaeger(String modelName, String mark, String origin) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
    }

    public Jaeger(String modelName, String mark, String origin, String equipment) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.equipment = equipment;
    }

    public Jaeger(String modelName, String mark, String origin, String equipment, String opSystem) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.equipment = equipment;
        this.opSystem = opSystem;
    }

    public Jaeger(String modelName, String mark, String origin, String equipment, String opSystem, String energyCore) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.equipment = equipment;
        this.opSystem = opSystem;
        this.energyCore = energyCore;
    }

    public Jaeger(String modelName, String mark, String origin, String equipment, String opSystem, String energyCore, String pilots) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.equipment = equipment;
        this.opSystem = opSystem;
        this.energyCore = energyCore;
        this.pilots = pilots;
    }

    public Jaeger(String modelName, String mark, String origin, String equipment, String opSystem, String energyCore, String pilots, float height) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.equipment = equipment;
        this.opSystem = opSystem;
        this.energyCore = energyCore;
        this.pilots = pilots;
        this.height = height;
    }

    public Jaeger(String modelName, String mark, String origin, String equipment, String opSystem, String energyCore, String pilots, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.equipment = equipment;
        this.opSystem = opSystem;
        this.energyCore = energyCore;
        this.pilots = pilots;
        this.height = height;
        this.weight = weight;
    }

    public Jaeger(String modelName, String mark, String origin, String equipment, String opSystem, String energyCore, String pilots, float height, float weight, int speed) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.equipment = equipment;
        this.opSystem = opSystem;
        this.energyCore = energyCore;
        this.pilots = pilots;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public Jaeger(String modelName, String mark, String origin, String equipment, String opSystem, String energyCore, String pilots, float height, float weight, int speed, int strength) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.equipment = equipment;
        this.opSystem = opSystem;
        this.energyCore = energyCore;
        this.pilots = pilots;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
    }

    public Jaeger(String modelName, String mark, String origin, String equipment, String opSystem, String energyCore, String pilots, float height, float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.equipment = equipment;
        this.opSystem = opSystem;
        this.energyCore = energyCore;
        this.pilots = pilots;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getOpSystem() {
        return opSystem;
    }

    public void setOpSystem(String opSystem) {
        this.opSystem = opSystem;
    }

    public String getEnergyCore() {
        return energyCore;
    }

    public void setEnergyCore(String energyCore) {
        this.energyCore = energyCore;
    }

    public String getPilots() {
        return pilots;
    }

    public void setPilots(String pilots) {
        this.pilots = pilots;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    boolean drift() {
        return true;
    }

    void move() {

    }

    String scanKaiju() {
        return "scanKaiju";
    }

    void attackKaiju() {

    }

    void destroyKaiju() {

    }

    void useVortexCannon() {

    }
}
