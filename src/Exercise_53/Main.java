/*
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 5 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
package Exercise_53;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строчные значения для списка");
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        System.out.println("Содержимое списка:");
        for (String s : list) {
            System.out.println(s);
        }
        int count = 0;
        while (count < 5) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
            count++;
        }
        System.out.println("Содержимое списка после выполнения операций:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
