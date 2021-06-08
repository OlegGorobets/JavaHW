/* Создать список строк. Ввести строки с клавиатуры и добавить их в список. Вводить с клавиатуры строки, пока
пользователь не введёт строку "end". "end" не учитывать. Вывести строки на экран, каждую с новой строки. */
package Exercise_62;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строки для списка:");
        for (int i = 0; i <= list.size(); i++) {
            String s = reader.readLine();
            if (!s.equals("end")) {
                list.add(s);
            }
        }
        System.out.println("Содержимое списка:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
