//Exercise 18.3

import java.util.Scanner;

public class TestRecursiveGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int m = input.nextInt();
        int n = input.nextInt();

        System.out.println("The Greatest Common Denominator of " + m + " and " + n + " is " + RecursiveGCD.gcd(m, n));
    }
}
