package animals;
class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Female", "Barbara", 8.25);
        double maxDogAge = Dog.MAX_AGE; // maxDogAge = 13
        Dog impossibleDog = new Dog("Male", "Dracula", 589.7608); // throws IllegalAgeException
        Horse horse = new Horse("Male", "Steve", 27.7897);
        int comparison = dog.compareTo(horse);
        System.out.println(comparison);
    }
}