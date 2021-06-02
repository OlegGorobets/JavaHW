/* Реализовать метод checkInterval. Метод должен проверять попало ли целое число в интервал от 20 до 50 и
сообщить результат на экран в следующем виде: "Число а не содержится в интервале." или "Число а содержится в
интервале.", где а - аргумент метода. */
package Exercise_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        checkInterval();
    }

    public static void checkInterval() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        int i = Integer.parseInt(reader.readLine());
        if (i >= 20 & i <= 50) {
            System.out.println("Число " + i + " содержится в интервале от 20 до 50.");
        } else {
            System.out.println("Число " + i + " не содержится в интервале от 20 до 50.");
        }
    }
}