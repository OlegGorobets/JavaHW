/* Посчитать сколько дней прошло с начала года. Используйте класс LocalDate. */
package Exercise_64;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dateStart = LocalDate.of(2021, 1, 1);
        LocalDate dateToday = LocalDate.now();

        System.out.println("Сначала года прошло " + (dateToday.getDayOfYear() - dateStart.getDayOfYear()) + " дней.");
    }
}
