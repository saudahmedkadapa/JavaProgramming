public class student1 {

    int prp_no;
    String name;

    student1() {
        prp_no = 432;
        name = "Alex";

    }

    student1(int p, String n) {
        prp_no = p;
        name = n;

    }

    public void display() {
        System.out.println("prp_no:" + prp_no + " Name:" + name);
    }

    public static void main(String args[]) {
        student1 s1 = new student1();
        s1.display();
        student1 s2 = new student1(3003, "John");
        s2.display();
    }

}
