/** 
Priority range: 1 (MIN) → 10 (MAX)
Default = 5
sleep() pauses thread for specified time
join() waits for thread to die before executing next line of code
*/

package threads;

class PriorityThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " Priority: " + Thread.currentThread().getPriority());

        try {
            Thread.sleep(1000); // pause for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class PrioirtyThreadExample {
    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
    }
}