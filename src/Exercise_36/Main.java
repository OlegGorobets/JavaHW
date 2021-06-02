/*
1. Создать массив на 5 строк.
2. Создать массив на 5 чисел.
3. Ввести с клавиатуры 5 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим
 индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/
package Exercise_36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] array = new String[5];
        int [] arr = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите содержимое массива строк:");
        for (int i = 0; i < array.length; i++) {
            String str = reader.readLine();
            array[i] = str;
            arr[i] = str.length();
        }
        System.out.println("Содержимое массива чисел:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Длина строки массива строк: " + arr[i] + ", Содержимое массива строк: " + array[i]);
        }
    }
}
