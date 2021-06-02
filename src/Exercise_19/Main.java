/* Вывести на экран квадрат 10х10 из букв P используя цикл while. */
package Exercise_19;

public class Main {
    public static void main(String[] args) {
        System.out.println("Квадрат 10 на 10 из P:");
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < 9) {
                System.out.print("P");
                j++;
            }
            System.out.println("P");
            i++;
        }
    }
}
/*
Заметка для тупых.
public class Main {
    public static void main(String[] args) {
        int i = 0;
        int j = 0; -ВОТ ТАК БЫТЬ НЕ МОЖЕТ
        while (i < 10) {
            while (j < 10) {
                System.out.print("P");
                j++;
            }
            System.out.println("I");
            i++;
        }
    }
}

 */
