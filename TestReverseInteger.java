//Exercise 18.8

import java.util.Scanner;

public class TestReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = input.nextInt();
        System.out.print("The reverse of your integer is ");
        ReverseInteger.reverseDisplay(value);
    }
}
