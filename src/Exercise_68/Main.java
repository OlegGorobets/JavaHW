/* Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
 */
package Exercise_68;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr);
        System.out.println("Наибольшие числа: " + arr[5] + ", " + arr[6] + ", " + arr[7] + ", " + arr[7] + ", " + arr[9] + ".");
    }
}
