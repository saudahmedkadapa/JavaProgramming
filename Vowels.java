import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        int count = 0;
        String s;
        Scanner str = new Scanner(System.in);
        System.out.println("enter the string");
        s = str.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'
                    || s.charAt(i) == 'E' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }

        }
        System.out.println("Number of vowels= " + count);
    }

}
