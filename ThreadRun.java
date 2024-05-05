class man implements Runnable{
    public void run()
    {
        System.out.println("I am the thread Man");
    }
}
class women implements Runnable{
    public void run()
    {

        for(int i=1;i<=5;i++)
        {
           System.out.println(i);
        }
    }
}





public class ThreadRun {
    public static void main(String[] args) {
        man m1=new man();
        Thread th1 =new Thread (m1);
        women w1 =new women();
         Thread th2 =new Thread (w1);

        th1.start();
        th2.start();
    }
    
}
