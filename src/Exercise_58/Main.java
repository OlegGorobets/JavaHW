/*
Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается. Программа выводит содержимое нового списка на экран. Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/
package Exercise_58;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> empy = new ArrayList<>();
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String str = reader.readLine();
            if (str.isEmpty()) {
                break;
            }
            empy.add(str);
        }
        System.out.println("Введите строки в список:");
        for (int i = 0; i <= list.size(); i++) {
            String str = reader.readLine();
            if (str.isEmpty()) {
                break;
            } else if (str.length()%2 == 0) {
                list.add(str + " " + str);
            } else {
                list.add(str + " " + str + " " + str);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
