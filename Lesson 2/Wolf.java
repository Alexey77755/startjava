
public class Wolf {

    private boolean isSex = true;
    private String nickname = "Bob";
    private float weight = 70.6f;
    private int age = 5;
    private String color = "black";

    public void go() {

    }

    public void sit() {

    }

    public void run() {

    }

    public void howl() {

    }

    public void hunt() {

    }

    public boolean getSex() {
        return isSex;
    }
    public String getNickname() {
        return nickname;
    }
    public float getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }

    public void setSex(boolean sex){
        isSex=sex;
    }
    public void setNickname(String nname){
        nickname=nname;
    }
    public void setWeight(float w){
        weight=w;
    }
    public void setAge(int a){
        if(a>8) {
            System.out.println("Некорректный возраст");
        }
        else {
            age=a;
        }
    }
    public void setColor(String color1){
       color=color1;
    }
}
