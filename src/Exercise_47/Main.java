/*
Создать список чисел и заполнить его с консоли
Разбить список на два других: - в первый список сохранять чётные числа - во второй список сохранять нечётные числа
Вывести содержимое всех списков в консоль. Каждый новый список выводить с новой строки, в ряд.
*/
package Exercise_47;

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
        for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(reader.readLine());
                if (num % 2 == 0) {
                    list.add(num);
                } else {
                    list.add(0, num);
                }
        }
        List<Integer> listPart1 = list.subList(list.size()/2, list.size());
        List<Integer> listPart2 = list.subList(0, list.size()/2);
        System.out.println("Содержимое списка list(нечётные|чётные): " + list);
        System.out.println("Содержимое списка listPart1(чётные): " + listPart1);
        System.out.println("Содержимое списка listPart2(нечётные): " + listPart2);
    }
}
