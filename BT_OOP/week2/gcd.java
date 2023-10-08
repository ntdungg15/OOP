package OOP;
public class gcd {

        /**
         *function to calculate the greatest common divisor.
         */
        public int gcd(int a, int b) {
            if (a == b) {
                return Math.abs(a);
            }
            if (a > b) {
                while (b != 0) {
                    int tmp = b;
                    b = a % b;
                    a = tmp;
                }
                return Math.abs(a);
            }
            while (a != 0) {
                int tmp = a;
                a = b % a;
                b = tmp;
            }
            return Math.abs(b);
        }
}
