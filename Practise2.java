import java.util.Scanner;

public class Practise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two nnumber=");
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum= " + sum);
        float percentage = (a + b) / 2;
        System.out.println("percentage= " + percentage);

    }

}
