//Exercise 18.2

public class IterativeFibonacci {
    public static int iFibonacci(int n) {
        int f0 = 0;
        int f1 = 1;

        for (int i = 1; i <= n - 2; i++) {
            int currentFibonacci = f0 + f1;
            f0 = f1;
            f1 = currentFibonacci;
        }

        return f1;
    }
}
