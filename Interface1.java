
interface Ground{
    default void Melborne()
    {
        System.out.println("I am the biggest cricket ground in the world");

    }
    default void Lords()
    {
        System.out.println("Im the home of Cricket");
    }
}
interface Player
{
    default void Virat()
    {
        System.out.println("Im the Greatest Cricketor");
    }
    default void Smith()
    {
        System.out.println("Im the best test batsman");

    }
}

class Cricket implements Ground,Player{
    public void bat()
    {
        System.out.println("bat");
    }



}
class cricketor implements Player{



}



public class Interface1 {
    public static void main(String[] args) {
        Cricket c=new Cricket();
        c.Melborne();
        cricketor c1=new cricketor();
        c1.Virat();
        


    }
    
}
