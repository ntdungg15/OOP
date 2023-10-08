import java.util.Scanner;
public class Fibonacci {
    public static long fibonacci(long n) {
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
        if(n < 0) {
            return -1;
        } else if (n > 92) {
            return Long.MAX_VALUE;
        } else if (n <= 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f1 +f0;
            }
        }
        return fn;
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextInt();
        System.out.println(fibonacci(n));
    }
}
