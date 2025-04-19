//Exercise 18.11

public class SumDigits {
    public static int sumDigits(long n) {
        int sum = 0;

        if (n != 0) {
            sum = sumDigits(n / 10) + (int)(n % 10);
        }

        return sum;
    }
}
