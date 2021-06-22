package Exercise_80;

import java.util.Comparator;

public class SalaryBossComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
