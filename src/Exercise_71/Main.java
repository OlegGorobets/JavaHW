/* Есть коллекция HashMap<String, String>, туда занесли 3 различные пары. При помощи метода printKeys:
Вывести на экран список ключей, каждый элемент с новой строки. */
package Exercise_71;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "один");
        map.put("2", "два");
        map.put("3", "три");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        for (Object s : map.keySet()) {
            System.out.println(s);
        }
    }
}
/*
public static void printKeys(Map<String, String> map)
    {
        for(Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            System.out.println(key);
        }
    }
 */