/*
Создать массив на 5 чисел. Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве. Вывести на экран максимальное и минимальное числа через пробел.
*/
package Exercise_61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числовые значения для массива");
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            arr[i] = num;
        }
        Arrays.sort(arr);
        System.out.println("Минимальное значение массива: " + arr[0] + " " + "Максимальное значение массива: " + arr[arr.length-1]);
    }
}
