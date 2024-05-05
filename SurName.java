import java.util.Scanner;

public class SurName {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        String word = "";
        for (i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                word = word + ch;

            } else {
                System.out.println(word.charAt(0) + " ");
                word = "";

            }

        }
        System.out.println(word);

    }
}
