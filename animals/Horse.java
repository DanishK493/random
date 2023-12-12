package animals;

public class Horse extends Animal {
    public static double MAX_AGE = 30;
    Horse(String gender, String name, double age) {
        super(gender, name, age);
    }
    @Override
    public double getMaxAge() {
        return MAX_AGE;
    }
}
