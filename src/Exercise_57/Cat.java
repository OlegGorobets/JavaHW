package Exercise_57;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int tailLength;

    public Cat(String name, int age, int weight, int tailLength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
    }
}
