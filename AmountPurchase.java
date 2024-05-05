import java.util.Scanner;

public class AmountPurchase {
    public static void main(String[] args) {
        double Discount;
        double amount;
        Scanner n = new Scanner(System.in);
        System.out.println("enter Your Purchase amount=");
        amount = n.nextDouble();
        if (amount >= 8000) {
            Discount = ((amount / 100) * 10);
            amount = amount - Discount;

            System.out.println("Final amount= " + amount);
            System.out.println("Discount= " + Discount);
        } else if (amount >= 5000)
            Discount = ((amount / 100) * 8);
        amount = amount - Discount;

        System.out.println("Final amount= " + amount);
        System.out.println("Discount=" + Discount);

    }
}
