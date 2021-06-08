/* Реверс числа
1) Ввести число с клавиатуры
2) Сделать реверс этого числа и вывести результат в консоль
Пример: входные данные: -5544 результат: -4455 */
package Exercise_65;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        int num = Integer.parseInt(reader.readLine());
        if (num < 0) {
            num = num + Math.abs(num * 2);
            String reverse = new StringBuffer(Integer.toString(num)).reverse().toString();
            System.out.println("-" + reverse);
        } else {
            String reverse = new StringBuffer(Integer.toString(num)).reverse().toString();
            System.out.println(reverse);
        }
    }
}
