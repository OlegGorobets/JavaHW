/* Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное,
то увеличить его на 10. Вывести результат на экран. */
package Exercise_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        int i = Integer.parseInt(reader.readLine());
        if (i > 0) {
            System.out.println("Число больше 0. Число увеличено в 2 раза: " + (i * 2));
        } else if (i < 0) {
            System.out.println("Число меньше 0. Число увеличено на 10: " + (i + 10));
        } else {
            System.out.println("Число равно 0.");
        }

    }
}
