class myThr extends Thread{
    public myThr(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=34;
        while(true){
        System.out.println("Thank you!!!!" + this.getName() );


        }
    }
}



public class Thread4 {
    public static void main(String[] args) {
        myThr t1=new myThr("Saud");
        myThr t2=new myThr("Ahmed (Most Important Thread)" );
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
    
}
