package recursion;

public class Main {
    public static void main(String[] args) {
     System.out.println(sum(5));
    }
    public static int sum(int number) {
        if (number > 0) {
            return number + sum(number - 1);
        } else {
            return 0;
        }
    }
}
