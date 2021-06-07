/* Посчитать время работы метода set в LinkedList и ArrayList */
package Exercise_51;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfSet(fill(new ArrayList())));
        System.out.println(getTimeMsOfSet(fill(new LinkedList())));
    }

    public static long getTimeMsOfSet(List list) {
        Date startTime = new Date();
        set10000(list);
        Date endTime = new Date();
        long fin = endTime.getTime() - startTime.getTime();
        return fin;
    }

    public static void set10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.set(0, new Object());
        }
    }

    private static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }
}