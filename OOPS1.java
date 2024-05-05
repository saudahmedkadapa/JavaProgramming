class Student {
    String name;
    int age;
    int rollno;

    public void PrintInfo() {

        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
    }

}

public class OOPS1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Saud Ahmed";
        s1.age = 22;
        s1.rollno = 420;

        s1.PrintInfo();
    }

}
