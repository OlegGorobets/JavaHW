/*
1) Создать метод convert, который должен конвертировать евро в доллары. В метод должен приходить один аргумент
(к-во евро). Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/
package Exercise_4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Метод convert: " + convert(1));;
        System.out.println("Метод convert: " + percent(1200));
        print("Метод print.");
    }

    public static double convert(int euro) {
        double dollars = euro * 1.22;
        return dollars;
    }

    public static int percent(int i) {
        int plusPercent = i / 10;
        return plusPercent;
    }

    public static void print(String str) {
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
    }
}
