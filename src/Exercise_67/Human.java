package Exercise_67;

import java.util.ArrayList;

public class Human {
    private String name;
    private boolean sex;
    private  int age;
    private ArrayList<Human> children;

    public Human(String name, boolean sex, int age, ArrayList<Human> children) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children = children;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Имя: " + name;
        text += ", " + "Пол: " + (sex?"мужчина":"женщина");
        text += ", " + "Возраст: " + age;
        if (children != null) {
            for (int i = 0; i < children.size(); i++) {
                text += ", " + "Дети: " + children.get(i).name;
            }
        }
        return text;
    }
}
