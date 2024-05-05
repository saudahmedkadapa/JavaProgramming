import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);

        i = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("enter the number between " + i + " to " + n);

        while (i <= n) {

            System.out.println(i);
            i++;
        }

    }

}
