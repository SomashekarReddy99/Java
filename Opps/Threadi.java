package Opps;

class Threadi implements Runnable {
    private static int count = 1;
    private static final int MAX_COUNT = 4;
    private static final Object lock = new Object();
    private final int threadId;

    public Threadi(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                // Check if the count exceeds the maximum count
                if (count > MAX_COUNT) {
                    break; // Exit the loop if the count exceeds MAX_COUNT
                }
                // Check if it's this thread's turn
                if (threadId == count) {
                    System.out.println("Thread " + threadId + " -> " + count);
                    // Move to the next count
                    count++;
                    lock.notifyAll(); // Notify other threads
                } else {
                    try {
                        lock.wait(); // Wait for the next turn
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Threadi(1));
        Thread t2 = new Thread(new Threadi(2));
        Thread t3 = new Thread(new Threadi(3));

        t1.start();
        t2.start();
        t3.start();
    }
}
