/*Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу
«фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
map.put("Rooney", "Leo");
map.put("Lloris", "Hugo");
map.put("Messi", "Leo");
map.put("Ronaldo", "Cristiano");
map.put("Maldini", "Paolo");
map.put("Indzaghi", "Pipo");
map.put("Del Piero", "Alesandro");
map.put("Balotelli", "Mario");
map.put("Gotze", "Mario");
map.put("Gomez", "Mario");*/
package Exercise_76;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        HashSet<String> valueSet = new HashSet<String>();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (!valueSet.add(entry.getValue())) {
                iterator.remove();
            }
        }
        /*
        Метод add() по HashSet вернется, false если значение уже было добавлено в набор. Вышеупомянутый метод используется,
        чтобы обнаружить, что дубликат был найден, а затем удаляет дубликат из HashMaps помощью метода remove() на итераторе.
         */

        System.out.println("--------------------------------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
