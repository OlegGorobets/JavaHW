package Exercise_75;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Date> map = new HashMap<>();
        map.put("Jhon", new Date("JUNE 1 1980"));
        map.put("Mark", new Date("JUNE 5 1999"));
        map.put("Elone", new Date("DECEMBER 13 1996"));
        map.put("Stieve", new Date("JUNE 1 1980"));
        map.put("Clark", new Date("MARCH 1 1980"));

        for (Map.Entry<String, Date> entry : map.entrySet()) {
            System.out.println(entry);
        }

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> entry = iterator.next();
            int value = entry.getValue().getMonth();
            if (value == 5 || value == 6 || value == 7) {
                iterator.remove();
            }
        }
        System.out.println("--------------------------------");
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}