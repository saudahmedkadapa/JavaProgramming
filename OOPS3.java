class Student {
    String name;
    int age;
    public static String school;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(int age2, int age) {
        System.out.println(age2 + " " + age);
    }
}

public class OOPS3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Saud";
        s1.age = 24;

        s1.printInfo(s1.age);

    }

}
