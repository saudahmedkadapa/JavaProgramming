public class DataHiding {

    private int no;
    private String name;
    private String Address;

    public int getno(){
        return no;

    }
    public void setno(int n)
    {
        // no=n;
        this.no=n;
    }
    public DataHiding(String naam,String add)

    {
        this.name=naam;
        this.Address=add;
    }
    public void Display()
    {
        System.out.println("Number="+no+"\n"+"Name="+name+"\n"+"Address="+Address);
    }

    public class nestedClass              //Inner Class Or Nested Class
    {
        private String Country; 


        public void func(String Country)
        {
            System.out.println("COuntry="+Country);
        }
    }


    
}
