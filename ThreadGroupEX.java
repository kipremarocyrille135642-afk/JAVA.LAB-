public class ThreadGroupEX {

    public static void main(String[] args) {

        ThreadGroup tg = new ThreadGroup("mygroup");

        MyThread mt1 = new MyThread(tg, "Thread1");
        MyThread mt2 = new MyThread(tg, "Thread2");
        MyThread mt3 = new MyThread(tg, "Thread3");

        mt1.start();
        mt2.start();
        mt3.start();
        gs
        System.out.println("Active Count in Group : " + tg.activeCount());
    }
}

class MyThread extends Thread {

    public MyThread(ThreadGroup g, String s) {
        super(g, s);
    }

    public void run() {
        System.out.println(
            "Thread Name: " + Thread.currentThread().getName()
            + ", Priority: " + Thread.currentThread().getPriority()
            + ", Thread Group: " + Thread.currentThread().getThreadGroup().getName()
        );
    }
}