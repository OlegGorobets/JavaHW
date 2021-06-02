/* Ввести с клавиатуры три числа, вывести на экран минимальное из них. */
package Exercise_8;

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
        System.out.println("Введите 3-е число:");
        int num3 = Integer.parseInt(reader.readLine());

        if (num1 < num2 & num1 < num3) {
            System.out.println("Число " + num1 + " меньше чисел " + num2 + " и " + num3 + ". Число " + num1 + " наименьшее.");
        } else if (num2 < num1 & num2 < num3) {
            System.out.println("Число " + num2 + " меньше чисел " + num1 + " и " + num3 + ". Число " + num2 + " наименьшее.");
        } else if (num3 < num1 & num3 < num2) {
            System.out.println("Число " + num3 + " меньше чисел " + num1 + " и " + num2 + ". Число " + num3 + " наименьшее.");
        } else if (num1 == num2 & num1 != num3) {
            System.out.println("Число " + num1 + " и число " + num2 + " равны. Наименьшее число отсутствует.");
        } else if (num2 == num3 & num2 != num1) {
            System.out.println("Число " + num2 + " и число " + num3 + " равны. Наименьшее число отсутствует.");
        } else if (num3 == num1 & num3 != num2) {
            System.out.println("Число " + num1 + " и число " + num3 + " равны. Наименьшее число отсутствует.");
        } else {
            System.out.println("Числа " + num1 + ", " + num2 + " и число " + num3 + " равны. Наименьшее число отсутствует.");
        }
    }
}