/* Реализовать метод closeToFive. Метод должен выводить на экран ближайшее к 5 из двух чисел,
записанных в аргументах метода. Например, среди чисел 3 и 6 ближайшее к пяти 6. Если оба числа на равной длине к 5,
то вывести на экран любое из них. */
package Exercise_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        closeToFive();
    }

    public static void closeToFive() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 1 -е число:");
        int i = Integer.parseInt(reader.readLine());
        System.out.println("Введите 2 -е число:");
        int j = Integer.parseInt(reader.readLine());
        if (Math.abs(i - 5) < Math.abs(j - 5)) {
            System.out.println("Ближайшее число к 5: " + i + ". Длина: " + Math.abs(i - 5) + ". ");
        } else if (Math.abs(i - 5) > Math.abs(j - 5)) {
            System.out.println("Ближайшее число к 5: " + j + ". Длина: " + Math.abs(j - 5) + ". ");
        } else {
            System.out.println("Оба числа на равной длине к 5. Длина: " + Math.abs(i - 5) + ". Числа: " + i + " и " + j + ". ");
        }
    }
}
