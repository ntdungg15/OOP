import java.util.Scanner;
public class So_nguyen_to {
    public static Boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            if (n == 2) {
                return true;
            }
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println(isPrime(n));
    }
}
