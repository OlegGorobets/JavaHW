/*
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/
package Exercise_66;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        getMinimum(getIntegerList());
    }

    public static List getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целые числа:");
        for (int i = 0; i <= list.size(); i++) {
            try {
                list.add(Integer.parseInt(reader.readLine()));
            } catch (Exception e) {
                break;
            }
        }
        return list;
    }

    public static void getMinimum(List list) {
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
