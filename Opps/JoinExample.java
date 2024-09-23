package Opps;

class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 1 - Count: " + i);
            try {
                Thread.sleep(500);  // Simulate some work with 500ms pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 2 - Count: " + i);
            try {
                Thread.sleep(500);  // Simulate some work with 500ms pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        // Create threads
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        // Start both threads
        t1.start();
        t2.start();

        // Wait for thread t1 to finish before proceeding
        try {
            t1.join();  // Waits until Task1 (t1) completes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread t1 has finished, now proceeding...");

        // Optionally wait for thread t2 to finish
        try {
            t2.join();  // Waits until Task2 (t2) completes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread t2 has finished.");
    }
}
