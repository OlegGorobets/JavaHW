/*
1) Создать метод sum, который должен суммировать 2 числа.
2) Создать метод multy, который должен умножить 2 числа.
3) Создать метод subt, который должен вычесть второе число из первого.
4) Создать метод div, который должен делить 2 числа.
*/
package Exercise_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Метод sum: " + sum(2, 2));
        System.out.println("Метод multy: " + multy(5, 5));
        System.out.println("Метод subt: " + subt(100, 5));
        System.out.println("Метод div: " + div(99, 3));
    }

    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static int multy(int num1, int num2) {
        int multy = num1 * num2;
        return multy;
    }

    public static int subt(int num1, int num2) {
        int subt = num1 - num2;
        return subt;
    }

    public static int div(int num1, int num2) {
        int div = num1 / num2;
        return div;
    }
}
