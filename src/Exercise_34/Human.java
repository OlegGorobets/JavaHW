package Exercise_34;

public class Human {
    private String name;
    private boolean sex;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Имя: " + name;
        text += ", " + "Пол: " + (sex?"мужчина":"женщина");
        if (age != 0) {
            text += ", " + "Возраст: " + age;
        }
        if (father != null) {
            text += ", " + "Отец: " + father.name;
        }
        if (mother != null) {
            text += ", " + "Мать: " + mother.name;
        }
        return text;
    }
}


