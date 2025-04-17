//Exercise 18.3

public class RecursiveGCD {
    public static int gcd(int m, int n) {
        int gcd;
        if (m % n == 0) {
            gcd = n;
        } else {
            gcd = gcd(n, m % n);
        }

        return gcd;
    }
}
