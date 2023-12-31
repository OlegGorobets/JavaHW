/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
package Exercise_48;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        int maxStr = 0;
        int indexStr = 0;
        int countMaxStr = 1;
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
            if (list.get(i).length() > maxStr) {
                maxStr = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (maxStr == list.get(i).length()) {
                indexStr = i;
                System.out.println("Самая длинная строка " + countMaxStr++ + ": Индекс: " + indexStr + ", Строка: " + list.get(i) + ", Длина: " + maxStr);
            }
        }
    }
}
