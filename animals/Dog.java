package animals;

public class Dog extends Animal {
    public static double MAX_AGE = 13;
    Dog(String gender, String name, double age) {
        super(gender, name, age);
    }
    @Override
    public double getMaxAge() {
        return MAX_AGE;
    }
}
