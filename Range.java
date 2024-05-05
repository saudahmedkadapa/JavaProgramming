import java.util.Scanner;

//find out all the prime numbers from number 2 to 10

public class Range {
    static int i;
    static int count;

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number");
        int s = n.nextInt();
        System.out.println("prime number between 1 to " + n + " are");
        for (int j = 2; j <= Math.sqrt(s); j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }

            }
            if (count == 2)
                System.out.println(j + " ");
        }
    }

}
