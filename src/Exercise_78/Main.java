/*
Ввести с клавиатуры 5 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
Вывести результат на экран.
Используй метод класса String - toCharArray();
Пример ввода:
String text = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
String text2 = "абв";
String text3 = "ддд";
String text4 = "яяа";
String text5 = "вввв";
Пример вывода:
а 3
б 2
в 6
г 1
д 4
…
я 3
*/
package Exercise_78;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] alphabetArray = alphabet.toCharArray();
        List<Character> alphabetList = new ArrayList<>();
        for (int i = 0; i < alphabetArray.length; i++) {
            alphabetList.add(alphabetArray[i]);
        }
        System.out.println("Введите строки:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            list.add(str.toLowerCase());
        }
        for (Character character : alphabetList) {
            int count = 0;
            for (String str : list) {
                char[] charArray = str.toCharArray();
                for (char c : charArray) {
                    if (character.equals(c)) {
                        count++;
                    }
                }
            }
            System.out.println(character + " " + count);
        }
    }
}
