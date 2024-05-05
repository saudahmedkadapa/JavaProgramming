public class ForEachTotal {
    public static void main(String args[]) {
        int arr[] = { 12, 13, 14, 44 };
        int total = 0;
        float avg;
        for (int i : arr) {
            total = total + i;
            avg = total / i;
            System.out.println("Total: " + total);
            System.out.println("Average" + avg);
        }
    }

}
