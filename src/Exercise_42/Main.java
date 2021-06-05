/*
Создать список из чисел и заполнить его на 5 элементов с консоли
Вывести все элементы списка в консоль
*/
package Exercise_42;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        System.out.println("Введите числовые значения для списка:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
