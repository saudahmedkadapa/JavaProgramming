class square
{
    int side;
    public int area()
    {
        return side*side;
    }
    public int triangle()
    {
        return (1/2*side*side);
    }
    public int perimeter()
    {
        return 4*side;
    }
}

public class Practise4 {
    public static void main(String[] args)
     {
        square sq=new square();
        sq.side=4;
        sq.area();
        System.out.println(sq.area());

        sq.triangle();
        System.out.println(sq.triangle());

        sq.perimeter();
        System.out.println(sq.perimeter());

    }



    
}
