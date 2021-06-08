/* Посчитать сколько прошло времени с начала сегодняшнего дня. Используйте класс Date. */
package Exercise_63;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dayStart = new Date();
        Date dayNow = new Date();
        dayStart.setMonth(5);
        dayStart.setYear(121);
        dayStart.setDate(8);
        dayStart.setHours(0);
        dayStart.setMinutes(0);
        dayStart.setSeconds(0);

        System.out.println("Сначала дня прошло: " + (dayNow.getTime() - dayStart.getTime()) + " миллисекунд или "
                + ((dayNow.getTime() - dayStart.getTime())/3600000) + " часов.");
    }
}
