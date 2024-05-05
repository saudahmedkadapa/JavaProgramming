import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of Elemnts = ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Array Elements=");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elemnts are =");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    System.out.println("Duplicate elemnts = " + arr[j]);
            }
        }

    }

}
