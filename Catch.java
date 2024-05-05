public class Catch {
    public static void main(String[] args) {
        try {
            System.out.println("example");
            throw new NullPointerException("Exception data");

        } catch (NullPointerException ne) {
            System.out.println(ne);
        }

    }

}

class main
{
    main
}
