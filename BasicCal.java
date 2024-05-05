import java.util.Scanner;

public class BasicCal {
    public static void main(String[] args) {
        int cal;
        Scanner num = new Scanner(System.in);
        System.out.println("enter the number 1");
        int n1 = num.nextInt();
        System.out.println("enter the number 2");
        int n2 = num.nextInt();

        System.out.println("select operetor");
        System.out.println("Addition=1 Substraction:2 Division:3 Multipilcation :4");
        int op = num.nextInt();
        switch (op) {
            case 1:
                cal = n1 + n2;

                System.out.println("Addition=" + cal);
                break;

            case 2:
                cal = n1 - n2;
                System.out.println("Substractio " + cal);
                break;

            case 3:
                cal = n1 / n2;
                System.out.println("Division " + cal);
                break;

            case 4:
                cal = n1 * n2;
                System.out.println("Multiplication " + cal);
                break;

        }

    }

}
