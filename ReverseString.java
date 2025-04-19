//Exercise 18.9

public class ReverseString {
    public static void reverseDisplay(String value) {
        if (value.length() > 0) {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}
