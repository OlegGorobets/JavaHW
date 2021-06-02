/* Реализовать метод compare(int a). Метод должен выводить строку на экран "Число меньше 5",
если параметр метода меньше 5 - и, выводить строку "Число больше 5", если параметр метода больше 5 - и,
и выводить строку "Число равно 5", если параметр метода равен 5 - и. */
package Exercise_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        compare(5);
    }

    public static void compare(int a) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        int i = Integer.parseInt(reader.readLine());
        if (i < 5) {
            System.out.println("Число меньше 5");
        } else if (i > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно 5");
        }
    }
}
