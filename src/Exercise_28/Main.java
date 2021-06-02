/* Ввести 5 строк с клавиатуры и записать их в массив */
package Exercise_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] array = new String[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите данные для массива строк:");
        for (int i = 0; i < array.length; i++) {
            String str = reader.readLine();
            array[i] = str;
        }
        System.out.println("Содержимое массива:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
