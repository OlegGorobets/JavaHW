/*
Создать список из целых чисел и заполнить его с консоли
Ввод целых чисел с клавиатуры продолжается, пока не ввели пустую строку в консоли
После того, как ввод завершён - вывести все элементы списка в консоль
*/
package Exercise_44;

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
        for (int i = 0; i <= list.size(); i++) {
            try {
                list.add(Integer.parseInt(reader.readLine()));
            }
            catch(Exception e)   {
                break;}
        }
        System.out.println("Содержимое списка:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
