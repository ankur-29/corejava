/**
Thread = lightweight process
Enables parallel execution
Created using:
 - Thread class
 - Runnable interface

Multiple threads run at same time in a code.
This is known as Multithreading.

- A thread is a smallest unit to work with. (individual task)
- They can run parallely.
- Multiple threads can share resources.
- Multiple threads run concurrently
- Order is not guaranteed in Multithreading.
**/

package threads;

// Creating thread using Thread class
class MyThread1 extends Thread {
    public void run() {
        for(int i=1;i<=100;i++)
		{
			System.out.println("Thread 1 is running...");
		}
    }
}

class MyThread2 extends Thread {
    public void run() {
        for(int i=1;i<=100;i++) {
            System.out.println("Thread 2 is running...");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
