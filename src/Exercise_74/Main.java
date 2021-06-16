/*
Создать словарь (Map<String, String>) занести в него 5 записей по принципу
«Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию:
- создать метод getCountTheSameFirstName(Map<String, String> map, String name), который должен вернуть количество пар с
именем, которое приходит в аргумент name
- создать метод getCountTheSameLastName(Map<String, String> map, String lastName), который должен вернуть количество пар
с фамилией, которая приходит в аргумент lastName
*/
package Exercise_74;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Gorobets", "Oleg");
        map.put("Hrapko", "Evgenii");
        map.put("Gorobets", "Oleg");
        map.put("Gazmanov", "Oleg");
        map.put("Kuligin", "Oleg");

        getCountTheSameFirstName(map, "Oleg");
        getCountTheSameLastName(map, "Gorobets");
    }

    public static void getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(name)) {
                count++;
            }
        }
        System.out.println("Совпадающих имен с заданным именем: " + count);
    }

    public static void getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String key : map.keySet()) {
            if (key.equals(lastName)) {
                count++;
            }
        }
        System.out.println("Совпадающих фамилий с заданной фамилией: " + count);
    }
}
