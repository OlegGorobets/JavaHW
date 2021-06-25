/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
List<String> list = new ArrayList<String>();
String s = list.get(18);
*/
package Exercise_87;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        try {
            String s = list.get(18);
        } catch (Exception e) {
            System.out.println("Catch: " + e.getMessage());
        }
    }
}
