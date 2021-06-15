/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
*/
package Exercise_67;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human son1 = new Human("son Lesha", true, 21, null);
        Human son2 = new Human("son Misha", true, 19, null);
        Human daughter = new Human("daughter Masha", false, 22, null);
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(son1);
        children.add(son2);
        children.add(daughter);
        Human father = new Human("papa Fedya", true, 50, children);
        ArrayList<Human> parents1 = new ArrayList<Human>();
        parents1.add(father);
        Human mother = new Human("mama Vika", false, 50, children);
        ArrayList<Human> parents2 = new ArrayList<Human>();
        parents2.add(mother);
        Human grandfather1 = new Human("ded Ivan", true, 70, parents1);
        Human grandmother1 = new Human("baba Masha", false, 65, parents1);
        Human grandfather2 = new Human("ded Oleg", true, 77, parents2);
        Human grandmother2 = new Human("baba Olga", false, 72, parents2);

        System.out.println(grandfather1.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(grandmother2.toString());
        System.out.println(parents1.toString());
        System.out.println(parents2.toString());
    }
}
