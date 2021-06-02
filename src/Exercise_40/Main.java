/* Задача по алгоритмам.
Есть массив чисел, в котором все числа дублируются, кроме одного. Найдите число, которое не имеет дубликатов в массиве.
Пример ввода: {1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6}
Пример вывода: 1
*/
package Exercise_40;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6};
        int num = 0;
        System.out.println("Содержимое массива чисел:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            num ^= arr[i];
        }
        System.out.print("\nЧисло " + num + " не имеет дубликатов в массиве.");
    }
}
