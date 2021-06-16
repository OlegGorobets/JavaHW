/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде:
«May is 5 month».
map.put("January",1);
map.put("February",2);
map.put("March",3);
map.put("April",4);
map.put("May",5);
map.put("June",6);
map.put("July",7);
map.put("August",8);
map.put("September",9);
map.put("October",10);
map.put("November",11);
map.put("December",12);
*/
package Exercise_77;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        map.put("January",1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May",5);
        map.put("June",6);
        map.put("July",7);
        map.put("August",8);
        map.put("September",9);
        map.put("October",10);
        map.put("November",11);
        map.put("December",12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        boolean bool = true;
        while (bool) {
            int num = Integer.parseInt(reader.readLine());
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(num)) {
                    System.out.println(entry.getKey() + " is " + entry.getValue() + " month.");
                }
            }
            if (num < 1 || num > 12) {
                bool = false;
            }
        }
       /* Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue().equals(num)) {
                System.out.println(entry.getKey() + " is " + entry.getValue() + " month.");
            }
        }*/
    }
}
