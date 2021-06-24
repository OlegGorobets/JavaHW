/*
Ввести с клавиатуры в список 5 слов.
Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка, а
второй – число, сколько раз данная строка встречалась в списке. Вывести содержимое словаря на экран.
*/
package Exercise_83;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 слов:");
        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            list.add(str);
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            map.put(list.get(i), count);
            count = 0;
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
