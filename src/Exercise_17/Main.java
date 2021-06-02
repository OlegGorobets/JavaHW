/*
Ввести с клавиатуры строку и число N. Вывести на экран строку N раз используя цикл while.
Пример ввода: pro 2
Пример вывода: pro pro
*/
package Exercise_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку:");
        String str = reader.readLine();
        System.out.println("Введите число:");
        int i = Integer.parseInt(reader.readLine());
        System.out.println("Строка " + str + " выводится " + i + " раз(а). ");
        while (i > 0) {
            System.out.print(str + " ");
            i--;
        }
    }
}
