class thread1 extends Thread{
    public void run()
    {
        int i=0;
        while(i<400)
        {
            System.out.println("Thread 1  Is On ");
            System.out.println("I am sad!!");
            i++;
        }
    }
}



public class Threading1 {
    public static void main(String[] args) {
        thread1 obj =new thread1();
        obj.run();
    }
    
}
