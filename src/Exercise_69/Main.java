/* Ввести с клавиатуры 5 слов и выведи их в алфавитном порядке. */
package Exercise_69;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] word = new String[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите слова:");
        for (int i = 0; i < word.length; i++) {
            word[i] = reader.readLine();
        }
        Arrays.sort(word);
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);;
        }
    }
}
