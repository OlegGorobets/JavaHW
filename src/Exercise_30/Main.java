/* Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
Посчитать сумму элементов массива и вывести её на экран. */
package Exercise_30;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 17, 5, 16, 19};
        System.out.println("Содержимое массива:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Сумма содержимого массива: " + (arr[0] + arr[1] + arr[2] + arr[3] + arr[4]));
    }
}
