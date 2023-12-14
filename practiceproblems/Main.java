import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && (N > 1 && N < 6)) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && (N > 5 && N < 21)) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        } 
        scanner.close();
    }
}








// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         int c = scan.nextInt();

//         System.out.println(a);
//         // Complete this line
//         // Complete this line
//         System.out.println(b);
//         System.out.println(c);
//     }
// }