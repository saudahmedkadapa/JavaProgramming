class Mythread implements Runnable 
{
    public void run() {
        System.out.println("I am thread");
    }
}

class Mythread2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I am not thret! i am the Thread");
        }

    }
}

public class Thread3 {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Thread th1 = new Thread(t1);
        Mythread2 t2 = new Mythread2();
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();

    }

}
