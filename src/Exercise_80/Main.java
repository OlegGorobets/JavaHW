/*
Создать класс User с 3 полями - age(int), name(String), salary(int)
Создать коллекцию HashMap<User, String> и добавить туда 5 записей по принципу юзер-должность
Данные добавлять с консоли, используя BufferedReader
Разделить коллекцию HashMap на 3 коллекции TreeSet:
- в первую коллекцию сохранять пользователей с должностью - boss
- во вторую коллекцию сохранять пользователей с должностью - worker
- в третью коллекцию сохранять пользователей с другими должностями
Отсортировать пользователей с должностью boss по параметру salary и вывести содержимое коллекции в консоль
Отсортировать пользователей с должностью worker по параметру age и вывести содержимое коллекции в консоль
Отсортировать пользователей с другими должностями по параметру name и вывести содержимое коллекции в консоль
*/
package Exercise_80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Comparator<User> bossComparator = new SalaryBossComparator();
        Comparator<User> workerComparator = new AgeWorkerComparator();
        Comparator<User> otherComparator = new OtherNameComparator();

        Map<User, String> boss = new HashMap<>();
        Map<User, String> worker = new HashMap<>();
        Map<User, String> other = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Age:");
            String ageStr = reader.readLine();
            if (ageStr.isEmpty()) {
                break;
            } int age = Integer.parseInt(ageStr);
            System.out.println("Name:");
            String name = reader.readLine();
            System.out.println("Salary:");
            int salary = Integer.parseInt(reader.readLine());
            System.out.println("Position:");
            String position = reader.readLine();

            User user = new User(age, name, salary);
            if (position.equals("boss")) {
                boss.put(user, position);
            } else if (position.equals("worker")) {
                worker.put(user, position);
            } else {
                other.put(user, position);
            }
        }

        System.out.println("Boss");
        TreeMap<User, String> sortedBoss = new TreeMap<>(bossComparator);
        sortedBoss.putAll(boss);
        for (Map.Entry<User, String> entry : sortedBoss.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("Worker");
        TreeMap<User, String> sortedWorker = new TreeMap<>(workerComparator);
        sortedWorker.putAll(worker);
        for (Map.Entry<User, String> entry : sortedWorker.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("Other");
        TreeMap<User, String> sortedOther = new TreeMap<>(otherComparator);
        sortedOther.putAll(other);
        for (Map.Entry<User, String> entry : sortedOther.entrySet()) {
            System.out.println(entry);
        }
    }
}
