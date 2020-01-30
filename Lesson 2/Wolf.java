
public class Wolf {

    private String sex = "male";
    private String nickname = "Bob";
    private float weight = 70.6f;
    private int age = 5;
    private String color = "black";

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(a > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
       this.color = color;
    }

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
}
