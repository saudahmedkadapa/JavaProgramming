public class Prime {

    public static void checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.print(n + "is not a prime number");

        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.print(n + "is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(n + "is a prime number");
            } // end of class
        }

    }

}
