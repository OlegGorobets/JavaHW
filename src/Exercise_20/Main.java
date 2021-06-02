/* Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
вывести на экран сумму и завершить программу. -1 должно учитываться в сумме. */
package Exercise_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        while (!exit) {
            System.out.println("Введите 1 -е число:");
            int i = Integer.parseInt(reader.readLine());
            System.out.println("Введите 2 -е число:");
            int j = Integer.parseInt(reader.readLine());
            if (i == -1) {
                System.out.println(i + " + " + j + " = " + (i + j) + "(" + i + ")");
                exit = true;
            } else if (j == -1) {
                System.out.println(i + " + " + j + " = " + (i + j) + "(" + j + ")");
                exit = true;
            } else {
                System.out.println(i + " + " + j + " = " + (i + j));
            }
        }
    }
}
