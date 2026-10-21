
class MySyncThread extends Thread {
    private String threadName;
    private SharedResource sharedResource;

    // Constructor to initialize thread name and shared resource
    public MySyncThread(String threadName, SharedResource sharedResource) {
        this.threadName = threadName;
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.printNumbers(threadName);
    }
}

// Define a class to represent a shared resource
class SharedResource {

    public synchronized void printNumbers(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - " + i);
            try {
                Thread.sleep(100); // Simulate some work
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Thread Complete ---");
    }
}

public class SyncThread
{

    public static void main(String[] args) {

        ShowMessage showMessage = new ShowMessage();

        MyThread thread1 = new MyThread("Thread-1", showMessage);
        MyThread thread2 = new MyThread("Thread-2", showMessage);

        thread1.start();
        thread2.start();
    }
}