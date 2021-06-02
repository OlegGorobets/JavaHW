/*
В методе initializeArray():
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
В методе printArray():
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
Каждый элемент - с новой строки.
*/
package Exercise_35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        printArray(initializeArray());
    }

    public static String[] initializeArray() throws IOException {
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите данные для строчного массива:");
        for (int i = 0; i < 8; i++) {
            String str = reader.readLine();
            array[i] = str;
        }
        for (int i = 8; i < array.length; i++) {
            String str = "empty";
            array[i] = str;
        }
        return array;
    }

    public static void printArray(String[] array) {
        System.out.println("Содержимое массива:");
        for (int i = array.length - 1; i > 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println("Содержимое массива в обратном порядке:");
        for (int i = array.length - 1; i > 0; i--) {
            System.out.println(array[i]);
        }
    }
}
