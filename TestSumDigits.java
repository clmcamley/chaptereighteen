//Exercise 18.11

import java.util.Scanner;

public class TestSumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = input.nextLong();
        System.out.print("The sum of the digits in your number is " + SumDigits.sumDigits(n));
    }
}
