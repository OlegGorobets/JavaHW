/*
Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.
Создать класс Cat с параметрами name, age, weight, tail;
Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде: "Cat name is " + name + ",
age is " + age + ", weight is " + weight + ", tail = " + tailLength; Вводить параметры с клавиатуры и создавать объект с
введенными параметрами.
Ввод продолжается, пока переменная с именем не пуста.
Добавлять каждый объект в список, в конце вывести содержимое списка на экран.
Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/
package Exercise_57;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {
        List<Cat> Cat = new ArrayList<Cat>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Name:");
            String name = reader.readLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Age:");
            int age = Integer.parseInt(reader.readLine());
            System.out.println("Weight:");
            int weight = Integer.parseInt(reader.readLine());
            System.out.println("TailLength:");
            int tailLength = Integer.parseInt(reader.readLine());

            Cat cat = new Cat(name, age, weight, tailLength);
            Cat.add(cat);

            for (int i = 0; i < Cat.size(); i++)
            {
                System.out.println(Cat.get(i));
            }
        }
    }
}
