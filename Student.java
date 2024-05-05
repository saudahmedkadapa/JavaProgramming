class Student {
    String name;
    int roll;
    public String id;
    public int age;

    void display(String name, int roll) {
        System.out.println("name = " + name);
        System.out.println(" roll = " + roll);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.display("Ram", 1);
        s1.display("sham", 2);

    }

    public void printInfo() {
    }
}
