//Exercise 18.8

public class ReverseInteger {
    public static void reverseDisplay(int value) {
        if (value != 0) {
            System.out.print(value % 10);
            value = value / 10;
            reverseDisplay(value);
        }
    }
}
