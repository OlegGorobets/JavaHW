/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/
package Exercise_85;

public class Main {
    public static void main(String[] args) {
        String s = null;
        try {
            String m = s.toLowerCase();
        } catch (Exception e) {
            System.out.println("Catch: " + e.getMessage());
        }
    }
}
