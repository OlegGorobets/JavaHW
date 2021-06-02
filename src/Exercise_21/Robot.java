package Exercise_21;

public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public boolean fight(Robot anotherRobot) {
        return power > anotherRobot.power;
    }
}
