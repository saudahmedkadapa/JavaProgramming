class function{

    public void ringing()
    {
        System.out.println("phone is Ringing");
    }
    public void vibration()
    {
        System.out.println(" is it vibration");
    }
    public void call()
    {
        System.out.println("your are calling me");
    }
}





public class CellPhone {
    public static void main(String[] args) 
    {
        function ph=new function();
        ph.call();
        ph.vibration();
        ph.ringing();
    }
    
}
