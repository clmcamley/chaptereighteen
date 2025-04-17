//Exercise 18.1

import java.util.Scanner;
import java.math.*;

public class RecursiveLargeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        System.out.println(n + "! is " + factorial(n));
    }

    public static BigInteger factorial(long n) {
        return factorial(n, BigInteger.valueOf(1));
    }
    
    public static BigInteger factorial(long n, BigInteger result) {
        if (n == 0) {
            return result;
        } else {
            return factorial(n - 1, result.multiply(BigInteger.valueOf(n)));
        }
    }
}
