import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        int i;
        String input;
        String[] words;

        Scanner a = new Scanner(System.in);
        System.out.println("enter the sentence");
        input = a.nextLine();
        words = input.split(" ");

        System.out.println("Reverse the sentence");
        for (i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i] + " ");
        }

    }

}