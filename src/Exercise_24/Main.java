/* Создать и заполнить массив из 10 чисел, значениями от 1 до 10 */
package Exercise_24;

public class Main {
    public static void main(String[] args) {
        int[] arr = new  int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
