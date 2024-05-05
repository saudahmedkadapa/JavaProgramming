import java.util.Scanner;

public class Arrayavg {
    public static void main(String[] args) {
        var AV = new Scanner(System.in);
        System.out.println("enter the number of element");
        int n = AV.nextInt();
        int Arr[] = new int[n];
        float sum = 0;
        for (int i = 0; i < n; i++) {
            Arr[i] = AV.nextInt();
            sum = sum + Arr[i];
        }
        float Avg = sum / n;
        System.out.println("Average : " + Avg);
    }
}
