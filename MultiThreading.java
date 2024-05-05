class thread1 extends Thread{

     @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            try{
                Thread.sleep(1000);

            }catch(InterruptedException e)
            {
                
            }
        }


    }
    
}




public class MultiThreading  {
   
    public static void main(String[] args) {
        thread1 obj=new thread1();
        obj.start();
    }
}
