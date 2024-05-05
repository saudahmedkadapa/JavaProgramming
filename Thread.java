class Mythread implements Runnable {
    public void run() {
        task1();
        task2();
        task3();
    }

    void task1() {
        System.out.println("task1");
    }

    void task2() {
        System.out.println("task2");
    }

    void task3() {
        System.out.println("task3");
    }
}

class Single {
    public static void main(String[] args) {
        Mythread obj = new Mythread();
        Thread t1 = new Thread();
        t1.start();
    }
}
