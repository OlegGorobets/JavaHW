/* Посчитать время работы метода remove в LinkedList и ArrayList */
package Exercise_52;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfRemove(fill(new ArrayList())));
        System.out.println(getTimeMsOfRemove(fill(new LinkedList())));
    }

    public static long getTimeMsOfRemove(List list) {
        Date startTime = new Date();
        remove10000(list);
        Date endTime = new Date();
        long fin = endTime.getTime() - startTime.getTime();
        return fin;
    }

    public static void remove10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
    }

    private static List fill(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(new Object());
        }
        return list;
    }
}