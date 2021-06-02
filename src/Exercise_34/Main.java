/*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, двое детей. Вывести объекты на экран.
Примечание: Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Катя, пол: женский, возраст: 55
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
package Exercise_34;

public class Main {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Anotoly", true, 85);
        Human grandmother1 = new Human("Nadezhda",false, 80);
        Human grandfather2 = new Human("Alexander", true, 70);
        Human grandmother2 = new Human("Liubov",false, 67);
        Human father = new Human("Oleg", true, 55, grandfather1, grandmother1);
        Human mother = new Human("Victoria", false, 47, grandfather2, grandmother2);
        Human child1 = new Human("Oleg", true,26, father, mother);
        Human child2 = new Human("Olga", false, 25, father, mother);

        System.out.println("Дедушки и бабушки:");
        System.out.println(grandfather1.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother2.toString());
        System.out.println("Отец и мать:");
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println("Дети:");
        System.out.println(child1.toString());
        System.out.println(child2.toString());
    }
}
