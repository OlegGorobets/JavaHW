/* Ввести 5 чисел с клавиатуры и записать их в массив. Вывести содержимое массива в консоль */
package Exercise_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите данные для массива чисел:");
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            arr[i] = num;
        }
        System.out.println("Содержимое массива:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
