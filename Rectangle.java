class AREA{
    int a,l;
    public int area()
    {
        return (a*l);
    }
    public int perimeter()
    {
        return 2*l+a;
    }

}



public class Rectangle {
    public static void main(String[] args) {
        AREA val=new AREA();
        val.a=6;
        val.l=5;
        val.area();
        System.out.println("Area="+val.area());

        val.perimeter();
        System.out.println("Perimeter= "+val.perimeter());
        
    }
    
}
