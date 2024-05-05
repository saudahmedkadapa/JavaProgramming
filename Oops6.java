class Students {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}

public class Oops6 {
    public static void main(String[] args) {
        Student.school = "GIT";
        Student student1 = new Student();
        student1.name = "saud ";
        System.out.println(student1.school);
    }
}
