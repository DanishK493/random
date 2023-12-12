package animals;

public abstract class Animal implements Comparable<Animal> {
    private String gender;
    private String name;
    private double age;

    public Animal(String gender, String name, double age) {
        if (age < 0 || age > getMaxAge()) {
            throw new IllegalAgeException(getMaxAge());
        }
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public abstract double getMaxAge();

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public int compareTo(Animal other) {
        return this.getName().compareTo(other.getName());
    }
}

class IllegalAgeException extends IllegalArgumentException {
    IllegalAgeException(double maxAge) {
        System.out.println("Age must be greater than 0 and less than " + maxAge);
    }
}
