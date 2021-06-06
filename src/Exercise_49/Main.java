/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
package Exercise_49;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        int minStr = 2147483647;
        int indexStr = 0;
        int countMinStr = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строчные значения для списка:");
        for (int i = 0; i <= list.size(); i++) {
            String str = reader.readLine();
            if (str.equals("")) {
                break;
            } else {
                list.add(str);
            }
        }
        System.out.println("Содержимое списка: " + list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minStr) {
                minStr = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (minStr == list.get(i).length()) {
                indexStr = i;
                System.out.println("Самая короткая строка " + countMinStr++ + ": Индекс: " + indexStr + ", Строка: " + list.get(i) + ", Длина: " + minStr);
            }
        }
    }
}
