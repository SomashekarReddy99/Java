package Opps;

class Counter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();  // Critical section: accessing shared resource
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        // Shared object between threads
        Counter counter = new Counter();

        // Create two threads that share the same Counter object
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        // Start the threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the result
        System.out.println("Final Count: " + counter.getCount());
    }
}

