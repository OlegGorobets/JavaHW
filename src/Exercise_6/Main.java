/*
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись: «Имя» будет получать «число1» через «число2» лет.
Пример: Alex будет получать 4000 через 5 лет.
*/
package Exercise_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя:");
        String name = reader.readLine();
        System.out.println("Введите 1-е число:");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите 1-е число:");
        int num2 = Integer.parseInt(reader.readLine());

        System.out.println(name + " будет получать " + num1 + "$ через " + num2 + " лет!");
    }
}
