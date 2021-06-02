/* Ввести с клавиатуры два числа, вывести на экран максимальное из них. */
package Exercise_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 1-е число:");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите 2-е число:");
        int num2 = Integer.parseInt(reader.readLine());

        if (num1 > num2) {
            System.out.println("Число " + num1 + " больше числа " + num2 + ". Число " + num1 + " наибольшее.");
        } else if (num1 < num2) {
            System.out.println("Число " + num1 + " меньше числа " + num2 + ". Число " + num2 + " наибольшее.");
        } else {
            System.out.println("Число " + num1 + " и число " + num2 + " равны. Наибольшее число отсутствует.");
        }
    }
}
