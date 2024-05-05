import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        int arr[] = { 0, 12, -35, 55, 75, 88, -195 };
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum= " + min + " Maximum= " + max);
    }
}
