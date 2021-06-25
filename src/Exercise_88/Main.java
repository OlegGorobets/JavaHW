/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
Map<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);
*/
package Exercise_88;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            Map<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (Exception e) {
            System.out.println("Catch: " + e);
        }
    }
}
