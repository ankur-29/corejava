/**
 NEW → RUNNABLE → RUNNING → WAITING/BLOCKED → TERMINATED
 NEW → created
 RUNNABLE → ready
 RUNNING → executing
 WAITING → waiting
 TERMINATED → finished
**/

package threads;

public class ThreadStateExample {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        });

        System.out.println("State: " + t1.getState()); // NEW

        t1.start();
        System.out.println("State: " + t1.getState()); // RUNNABLE

        Thread.sleep(100);
        System.out.println("State: " + t1.getState()); // TIMED_WAITING

        t1.join();
        System.out.println("State: " + t1.getState()); // TERMINATED
    }
}