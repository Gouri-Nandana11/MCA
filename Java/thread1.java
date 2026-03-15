// Thread A - Extending Thread class
class SquareThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Square of " + i + " = " + (i * i));
                Thread.sleep(500); // 500 ms delay
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Thread B - Implementing Runnable interface
class CubeThread implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Cube of " + i + " = " + (i * i * i));
                Thread.sleep(700); // 700 ms delay
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Main Class
public class thread1 {
    public static void main(String[] args) {

        SquareThread t1 = new SquareThread();     // Thread A
        CubeThread obj = new CubeThread();
        Thread t2 = new Thread(obj);              // Thread B

        t1.start();
        t2.start();

        try {
            t1.join();   // wait for thread A
            t2.join();   // wait for thread B
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Calculations Complete!");
    }
}