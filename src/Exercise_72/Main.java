/* Есть коллекция HashMap<String, String>, туда занесли 3 различные пары. При помощи метода printValues:
Вывести на экран список значений, каждый элемент с новой строки. */
package Exercise_72;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "один");
        map.put("2", "два");
        map.put("3", "три");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        for (String s : map.values()) {
            System.out.println(s);
        }
    }
}
/*
public static void printValues(Map<String, String> map)
    {
        for(Map.Entry<String, String> pair : map.entrySet())
        {
            String value = pair.getValue();
            System.out.println(value);
        }
    }
 */