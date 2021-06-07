/*
1. Введи с клавиатуры 5 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
Пример:
краб
лось
рак
Выходные данные:
краб краб
лось лось
рак рак
*/
package Exercise_56;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        doubleValues(list);
    }

    public static void doubleValues(List<String> list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строчные значения для списка");
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        System.out.println("Содержимое списка:");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Выходные данные:");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i) + " " + list.get(i));
        }
    }
}
