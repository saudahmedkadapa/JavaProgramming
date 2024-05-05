class Shape{
    public void area()
    {
        System.out.println("Area ");
    }

}
class Triangle extends Shape{
    public void area(int l,int h)
    {
        System.out.println(1/2*l*h);
    }
    


}



public class Inherit1Oops {
    public static void main(String[] args) {
       
        Triangle t1=new Triangle();
        t1.area();


       
       




    }

    
}
