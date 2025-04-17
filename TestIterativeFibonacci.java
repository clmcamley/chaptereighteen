//Exercise 18.2

import java.util.Scanner;

public class TestIterativeFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int n = input.nextInt();

        System.out.println("The Fibonacci number at index " + n + " is " + IterativeFibonacci.iFibonacci(n));
    }
}
