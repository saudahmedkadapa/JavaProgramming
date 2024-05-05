class MyThread implements Runnable {
    String message;

    MyThread(String msg) {
        message = msg;
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                System.out.println("Run method: " + message + " " + "count-" + i);
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println("Exception in thread: " + ie.getMessage());
            }
        }
    }
}

public class DemoMainThread {
    public static void main(String[] args) {
        MyThread obj1 = new MyThread("MyThread obj1");
        MyThread obj2 = new MyThread("MyThread obj2");
        Thread t1 = new Thread(obj1); // creating thread object t1 using Thread() constructor
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}