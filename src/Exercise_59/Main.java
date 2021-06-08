/*
Ввести с клавиатуры 5 чисел и заполнить ими список. Вывести их в обратном порядке. Использовать только цикл for.
*/
package Exercise_59;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа в список:");
        for (int i = 0; i <= list.size(); i++) {
            try {
                list.add(Integer.parseInt(reader.readLine()));
            } catch (Exception e) {
                break;
            }
        }
        System.out.println("Содержимое списка в обратном порядке:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
