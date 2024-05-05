class Student1 {

    Student1() {
        // Default Constructor
        System.out.println("Student are in exam");
    }
}

class Student {
    int id;
    String name;

    // Parameterized Constructor
    Student(int i, String n) {
        id = i;
        name = n;

    }

    void display() {
        System.out.println(id + " " + name);
    }
}

class Student2 {
    int id;
    String name;

    // Copy Constructor
    Student2(int i, String n) {
        id = i;
        name = n;
    }

    Student2(Student2 s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Constructor {

    public static void main(String[] args) {
        System.out.println("default constructor value =");
        Student1 c = new Student1();

        System.out.println("parameterized Construtor value=");
        Student s1 = new Student(111, "Saud");
        Student s2 = new Student(222, "Omkar");
        s1.display();
        s2.display();

        System.out.println("Copy constructor value=");
        Student2 s3 = new Student2(111, "Karan");
        Student2 s4 = new Student2(233, "zaid");
        s3.display();
        s4.display();
    }

}
