class Person{
    private String name;
    private int age;
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge(){
        return age;

    }
}




public class OopsPractise {
    public static void main(String[] args) {
        Person p1=new Person("Saud ",22);
        Person p2=new Person("ahmed",21);
        System.out.println(p1.getName()+ " is " + p1.getAge() + " years old");
         System.out.println(p2.getName()+ " is " + p2.getAge() + " years old\n");
    }
    
}
