/*
1) Создать по одной переменной каждого типа данных, который ты знаешь.
2) Присвоить каждой переменной значение в диапазоне типа.
3) Вывести значение каждой переменной в консоль, каждое значение выводить с новой строки.
*/
package Exercise_1;

public class Main {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        char c = 'a';
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.4e+38f;
        double d = 1.7e+308;
        boolean bool = true;
        String str = "str";

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("char: " + c);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);
    }
}
