
public class String2 {
    public static void main(String[] args) {
        //

        String letter = "Dear <|name|>,Thanks alot!";
        letter = letter.replace("<|name|>", "Saud");

        System.out.println(letter);
    }

}
