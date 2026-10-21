// Java program to set Thread name and priority

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running with name: "
                + Thread.currentThread().getName());

        System.out.println("Thread priority: "
                + Thread.currentThread().getPriority());
    }
}

public class SetGetThread {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        myThread.setName("MyThread#1");
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();

        // Main Thread
        System.out.println("Main thread name: "
                + Thread.currentThread().getName());

        System.out.println("Main thread priority: "
                + Thread.currentThread().getPriority());
    }
}