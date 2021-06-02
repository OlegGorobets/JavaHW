/*
1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и сделать так, чтобы объекты стали мужем и женой.
*/
package Exercise_23;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Oleg", 26, "Anna");
        Woman woman = new Woman("Anna", 21, "Oleg");

        System.out.println("Имя: " + man.getName() + ", Возраст: " + man.getAge() + ", Жена: " + man.getWife() + ".");
        System.out.println("Имя: " + woman.getName() + ", Возраст: " + woman.getAge() + ", Муж: " + woman.getHusband() + ".");
    }
}
