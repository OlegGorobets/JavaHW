package Exercise_80;

public class User {
    private int age;
    private String name;
    private int salary;

    public User(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Age is " + age + ", name is " + name + ", salary is " + salary;
    }
}
