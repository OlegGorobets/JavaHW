/* Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
Найти минимальный элемент в массиве и вывести его в консоль. */
package Exercise_31;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 17, 5, 16, 19};
        System.out.println("Содержимое массива:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Минимальный элемент массива: " + arr[0]);
    }
}
/*  Можна и так(в интернете нашел).
int[] arr8 = new int[]{16, 14, 17, 14, 15};
        int min = arr8[0];
        for (int i = 0; i < arr8.length; i++) {
            System.out.print(arr8[i] + " ");
        }
        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] < min) {
                min = arr8[i];
            }
        }
        System.out.println("\n" + min);

        System.out.println("");
    }
}
 */