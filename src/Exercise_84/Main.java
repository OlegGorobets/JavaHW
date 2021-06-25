/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
int a = 42 / 0;
*/
package Exercise_84;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        } catch (Exception e) {
            System.out.println("Catch: " + e.getMessage());;
        }
    }
}
