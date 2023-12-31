/* Ввести с клавиатуры три числа, вывести на экран среднее из них. */
package Exercise_9;

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

        if (num1 < num2 & num1 > num3 || num1 > num2 & num1 < num3) {
            System.out.println("Число " + num1 + " среднее.");
        } else if (num2 < num1 & num2 > num3 || num2 > num1 & num2 < num3) {
            System.out.println("Число " + num2 + " среднее.");
        } else if (num3 < num1 & num3 > num2 || num3 > num1 & num3 < num2) {
            System.out.println("Число " + num3 + " среднее.");
        } else if (num1 == num2 & num1 != num3) {
            System.out.println("Число " + num1 + " и число " + num2 + " равны. Среднее число отсутствует.");
        } else if (num2 == num3 & num2 != num1) {
            System.out.println("Число " + num2 + " и число " + num3 + " равны. Среднее число отсутствует.");
        } else if (num3 == num1 & num3 != num2) {
            System.out.println("Число " + num1 + " и число " + num3 + " равны. Среднее число отсутствует.");
        } else {
            System.out.println("Числа " + num1 + ", " + num2 + " и число " + num3 + " равны. Среднее число отсутствует.");
        }
    }
}
