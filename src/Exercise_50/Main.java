/*
1. Введи с клавиатуры 6 чисел, сохрани их в список и рассортируй по трём другим спискам: Число делится на 3 (x%3==0),
делится на 2 (x%2==0) и все остальные. Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Создай метод printList - он должен выводить на экран все элементы списка с новой строки. 3. Используя метод printList
выведи эти три списка на экран.
Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/
package Exercise_50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числовые значения для списка:");
        for (int i = 0; i < 6; i++) {
                int num = Integer.parseInt(reader.readLine());
                list.add(num);
        }
        System.out.println("Содержимое списка: " + list);
        printList(list);
    }

    public static void printList(ArrayList<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        System.out.println("\n");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%3 == 0) {
                list1.add(list.get(i));
            } else if (list.get(i)%2 == 0) continue;
        }
        System.out.println("Содержимое списка(x%3): " + list1);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 == 0) {
                list2.add(list.get(i));
            } else if (list.get(i)%3 == 0) {
                continue;
            } else {
                list3.add(list.get(i));
            }
        }
        System.out.println("Содержимое списка(x%2): " + list2);
        System.out.println("Содержимое списка(остальное): " + list3);
    }
}
