import java.util.Scanner;

public class EvenNodd {
    public static void main(String[] args) {
        int i;
        System.out.println("enter the array element");
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int Arr[] = new int[a];
        for (i = 0; i < a; i++) {
            if (a[i] % 2 != 0) {
                System.out.println("Even number");
            }
            System.out.println("odd number");
        }

    }

}
