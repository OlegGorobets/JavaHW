/*
Создать список чисел и заполнить его с консоли
Удалить все числа больше 5
*/
package Exercise_46;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числовые значения для списка:");
        for (int i = 0; i <= list.size(); i++) {
            try {
                list.add(Integer.parseInt(reader.readLine()));
            } catch (Exception e) {
                break;
            }
        }
        list.removeIf(num -> num < 5);
        System.out.println(list);
    }
}
