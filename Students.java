public class Students {
    // instance variables of the class
    int id;
    String name;

    Students() {
        System.out.println("this a default constructor");
    }

    Students(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        // object creation
        Student s = new Students();
        System.out.println("\nDefault Constructor values: \n");
        System.out.println("Student Id : " + s.id + "\nStudent Name : " + s.name);

        System.out.println("\nParameterized Constructor values: \n");
        Student students = new Students(10, "David");
        System.out.println("Student Id : " + students.id + "\nStudent Name : " + students.name);
    }
}