package Exercise_79;

public class Robot implements Comparable<Robot>{
    private int power;
    private String model;

    public Robot(int power, String model) {
        this.power = power;
        this.model = model;
    }

    @Override
    public int compareTo(Robot o) {
        int i = this.model.compareTo(o.model);
        if (i == 0) {
           i = Integer.compare(this.power, o.power);
        }
        return i;
    }
}
