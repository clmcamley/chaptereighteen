//Exercise 18.9

import java.util.Scanner;

public class TestReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String value = input.nextLine();
        System.out.print("Your string reversed is ");
        ReverseString.reverseDisplay(value);
    }
}
