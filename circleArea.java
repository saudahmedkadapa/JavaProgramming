//Q.Write Java methods to calculate the area of a circle.(using user input)

import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        float A;
        try (Scanner c = new Scanner(System.in)) {
            System.out.println("Find the area of circle ");
            System.out.println("value of r");
            int r = c.nextInt();

            System.out.println("value of pi");
            float pi = c.nextFloat();

            A = pi * (r * r);
        }
        System.out.println("area of cirlce=" + A);

    }

}
