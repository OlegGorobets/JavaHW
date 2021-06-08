/*
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/
package Exercise_60;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите N:");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Введите M:");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Введите строки в список:");
        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        for (int i = 0; i < m; i++) {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        System.out.println("Содержимое списка:");
       for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i));
       }
    }
}
