/*
Задача по алгоритмам.
Реализовать алгоритм бинарного поиска (загугли, разберись что это и реализуй)
*/
package Exercise_82;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) throws IOException {
        int counter, num, item, array[], first, last;

        //Создаем объект BufferedReader для считывания чисел, введенных пользователем
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество элементов массива: ");
        num = Integer.parseInt(reader.readLine());

        // Создаем массив введенного пользователем размера
        array = new int[num];

        System.out.println("Введите " + num + " чисел");

        //Заполняем массив, вводя элементы в консоль
        for (counter = 0; counter < num; counter++)
            array[counter] = Integer.parseInt(reader.readLine());

        // сортируем элементы массива, так как для бинарного поиска
        // элементы массива должны быть отсортированными
        Arrays.sort(array);

        System.out.println("Введите элемент для бинарного поиска: ");
        item = Integer.parseInt(reader.readLine());
        first = 0;
        last = num - 1;

        // метод принимает начальный и последний индекс, а также число для поиска
        binarySearch(array, first, last, item);
    }

    // бинарный поиск
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;    // для подсчета количества сравнений

        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + comparisonCount + " сравнений");
        }
    }

}