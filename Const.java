
class MainEmployee
{
    public MainEmployee()
    {
        int id=54;
        String name="Saud ahmed";
    }

    private int id;
    private String name;

    public String getName()
    {
       return name;
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public void setid(int i)
    {
        this.id=i;
    }
    public int getid()
    {
        return id;
    }
}


public class Const {
    public static void main(String[] args)
     {
        MainEmployee me=new MainEmployee();

        me.setName("Saud ahmed");
         me.setid(54);
         
         System.out.println(me.getid());
         System.out.println(me.getName());

        
    }
    
}
