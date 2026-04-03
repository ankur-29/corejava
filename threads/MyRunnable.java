/**
 - Runnable is preferred (no inheritance limitation)
 - Thread is class → limits extending another class
**/

package threads;

// Using Runnable
class RunnableExample implements Runnable {
    public void run() {
        System.out.println("Runnable thread running...");
    }
}

public class MyRunnable {
    public static void main(String[] args) {

        RunnableExample obj = new RunnableExample();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}