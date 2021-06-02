/*
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
package Exercise_37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr1 = new int[10];
        int[] arr2 = new int[5];
        int[] arr3 = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите содержимое массива чисел:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Содержимое массива чисел:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Содержимое первой части массива чисел:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);;
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i + 5];
        }
        System.out.println("Содержимое второй части массива чисел:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);;
        }
    }
}
/* Можно так.
public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr1 = new int[10];
        int[] arr2 = new int[5];
        int[] arr3 = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа в массив: ");
        for (int i = 0; i < arr1.length; i++) {
            int a = Integer.parseInt(reader.readLine());
            arr1[i] = a;
            for (int j = i; j < arr2.length; j++) {
                arr2[j] = arr1[i];
            }
        }

        for (int i = 5; i < arr1.length; i++) {
            for (int j = i - 5; j < arr3.length; j++) {
                arr3[j] = arr1[i];
            }
        }

        System.out.println("Сожержимое массива чисел[10]: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\n" + "Сожержимое 1-го массива чисел[5]: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n" + "Сожержимое 2-го массива чисел[5]: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
 */