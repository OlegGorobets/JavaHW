/*
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
3. В выполняющем методе main выведите максимальное число в консоль
*/
package Exercise_32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        max(initializeArray());
    }

    public static int[] initializeArray() throws IOException {
        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите данные для массива чисел:");
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            arr[i] = num;
        }
        return arr;
    }

    public static void max(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Максимальный элемент массива: " + arr[9]);
    }
}
/* Можна и так(в интернете нашел).
package two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        max(initializeArray());
    }

    public static int[] initializeArray() throws IOException {
        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа:");
        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(reader.readLine());
            arr[i] =  a;
        }
        return arr;
    }

    public static void max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\n" + "Максимальный элемент массива: " + max);
    }
}
 */
