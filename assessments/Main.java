package assessments;

public class Main {
    public static void main(String[] args) {
        int threads = 100;
        for (int i = 0; i < threads; i++) {
            MultiThreading mt = new MultiThreading();
            mt.start();
        }
    }
}

class MultiThreading extends Thread {
    public void run() {
        try {
          System.out.println("Thread " + Thread.currentThread().getId() + " is running");  
        } catch (Exception e) {
            System.out.println("Expection caught");
        }
    }
}
