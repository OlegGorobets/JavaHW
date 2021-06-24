/*
Задача по алгоритмам. Найти ряд Фиббоначи для числа 10
*/
package Exercise_81;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(15));
        System.out.println(fibonacciRecursion(15));
        System.out.println(fibonacciRecursionBigInteger(50));
    }

    public static int fibonacci(int n) {
        int num1 = 1;
        int num2 = 1;
        for (int i = 2; i < n; i++) {
            num2 = num1 + num2;
            num1 = num2 - num1;
        }
        return num2;
    }

    public static int fibonacciRecursion(int n) {
        if (n < 2) return n;
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static BigInteger fibonacciRecursionBigInteger(int n)
    {
        if (n < 2) return BigInteger.valueOf(n);
        return fibonacciRecursionBigInteger(n - 1).add(fibonacciRecursionBigInteger(n - 2));
    }
}
