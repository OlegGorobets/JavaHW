/*
Создать список чисел и заполнить его с консоли следующим образом: чётные числа добавляют в конец списка,
нечётные — в начало.
*/
package Exercise_45;

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
                int num = Integer.parseInt(reader.readLine());
                if (num%2 == 0) {
                    list.add(num);
                } else {
                    list.add(0, num);
                }
            } catch (Exception e) {
                break;
            }
        }
        System.out.println("Содержимое списка:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
/*for (int i = 0; i <= list.size(); i++) {
            try {
                list.add(Integer.parseInt(reader.readLine()));
            }
            catch(Exception e)   {
                break;}
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b%2 - a%2;
            }
        });*/