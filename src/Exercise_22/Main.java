/*
1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и сделать так, чтобы владельцем каждого питомца
была одна и та же женщина.
*/
package Exercise_22;

public class Main {
    public static void main(String[] args) {
        Woman woman = new Woman("Eva", 21);
        Dog dog = new Dog("Rex", 2, woman.getName());
        Fish fish = new Fish("Nemo", 1, woman.getName());
        Cat cat = new Cat("Murka", 2, woman.getName());

        System.out.println("Имя: " + woman.getName() + ", " + "Возраст: " + woman.getAge());
        System.out.println("Имя: " + dog.getName() + ", " + "Возраст: " + dog.getAge() + ", "  + "Владелец: " + dog.getOwner());
        System.out.println("Имя: " + fish.getName() + ", " + "Возраст: " + fish.getAge() + ", "  + "Владелец: " + fish.getOwner());
        System.out.println("Имя: " + cat.getName() + ", " + "Возраст: " + cat.getAge() + ", "  + "Владелец: " + cat.getOwner());
    }
}
