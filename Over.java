class A{
    public int a;
    public int Name(){
        return a;
    }
    public void meth2()
    {
        System.out.println("I am the method 2 of the class A ");
    }
}
 
class B extends  A
{
    @Override
    public void meth2()
    {
        System.out.println("I am the method 2 of the class A");

    }
    public void meth3(){
        System.out.println("I am the method 3 of the class B ");
    }

}



public class Over {
    public static void main(String[] args) {
        A x=new A();
        x.meth2();
    }
    
}
