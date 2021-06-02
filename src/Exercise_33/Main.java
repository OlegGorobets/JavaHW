/* Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
package Exercise_33;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("8");
            }
            System.out.println("8");
        }
    }
}
/*Можна и так(1-е сам сделал(оно и видно), 2-е в интернете нашел).
package three;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"8", "88", "888", "8888", "88888", "888888", "8888888", "88888888", "888888888", "8888888888"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 1; i <= 10; i++){  //не моё
            for (int a = 0; a < i; a++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
 */
