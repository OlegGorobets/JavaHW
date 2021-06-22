/*
Создать класс Robot с двумя полями - power(int), model(String)
Создать коллекцию TreeMap и добавить туда 3 роботов
Реализовать интерфейс Comparable в классе Robot:
- метод compareTo должен сравнивать имена в алфавитном порядке, если имена одинаковые, то сравнение должно проходить по полю power
Вывести в консоль содержимое коллекции TreeMap
*/
package Exercise_79;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot(101, "A");
        Robot robot2 = new Robot(102, "B");
        Robot robot3 = new Robot(98, "C");

        Map<Robot, String> map = new TreeMap<>();
        map.put(robot1, "1");
        map.put(robot2, "2");
        map.put(robot3, "3");

        for (Map.Entry<Robot, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
