/* Удалить все числа больше 10 Создать множество чисел (Set<Integer>), занести туда 5 различных чисел.
При помощи метода removeAllNumbersMoreThan10 удалить из множества все числа больше 10. */
package Exercise_73;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(12);
        set.add(100);
        set.add(9);
        set.add(1);

        removeAllNumbersMoreThan10(set);
        for (Integer s : set) {
            System.out.println(s);
        }
    }

    public static void removeAllNumbersMoreThan10(Set<Integer> set) {
        set.removeIf(num -> num > 10);
    }
}
