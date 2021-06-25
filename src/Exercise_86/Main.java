/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/
package Exercise_86;

public class Main {
    public static void main(String[] args) {
        int[] m = new int[2];
        try {
            m[8] = 5;
        } catch (Exception e) {
            System.out.println("Catch: " + e);
        }
    }
}
