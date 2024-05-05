public class Program_5 {
    public static void main(String[] args) {

        Student st1 = new Student(); // for default constructor

        System.out.println("Parameterised constructor");
        Student st2 = new Student("Sumeet", 15, 26);
        System.out.println(st2.getName());
        System.out.println(st2.getRollno());
        System.out.println(st2.getAge());
    }
}