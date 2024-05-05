class Parents{
    String name;
    int age;

     public void child(){
        System.out.println(name);
     }
     public void child(int age)
     {
        System.out.println(age);
     }
     public void child(int age, String name)
     {
        System.out.println(name 
        +" "+age);
     }
}




public class PolyOops {
    public static void main(String[] args) {
        Parents pan= new Parents();
        pan.age =25;
        pan.name="Saud";
        pan.child(pan.age,pan.name);

    }
    
}
