/*
Создать коллекцию HashMap<String, String>, занести туда 4 пары строк
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода:
ключ - значение
ключ - значение
ключ - значение
ключ - значение
*/
package Exercise_70;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "один");
        map.put("2", "два");
        map.put("3", "три");
        map.put("4", "четыре");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
