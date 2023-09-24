public class Solution {
    /**
     * fraction.
     */
    private int numerator;
    private int denominator;

    /**
     * getNumerator.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * getDenominator.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * setNumerator.
     */
    public void setNumerator(int x) {
        numerator = x;
    }

    /**
     * setDenominator.
     */
    public void setDenominator(int x) {
        if (x != 0) {
            denominator = x;
        } else {
            denominator = 1;
        }
    }

    /**
     * Constructor.
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0) {
            this.denominator = 1;
        }
    }

    /**
     * gcd.
     */
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    /**
     * reduce.
     */
    public Solution reduce() {
        int x = gcd(this.numerator, this.denominator);
        this.numerator /= x;
        this.denominator /= x;
        return this;
    }

    /**
     * add.
     */
    public Solution add(Solution x) {
        Solution sum = new Solution(1, 1);
        sum.setNumerator(this.numerator * x.denominator + this.denominator * x.numerator);
        sum.setDenominator(this.denominator * x.denominator);
        this.setNumerator(sum.numerator);
        this.setDenominator(sum.denominator);
        this.reduce();
        return this;
    }

    /**
     * substract.
     */
    public Solution subtract(Solution x) {
        Solution difference = new Solution(1, 1);
        difference.setNumerator(this.numerator * x.denominator - this.denominator * x.numerator);
        difference.setDenominator(this.denominator * x.denominator);
        this.setNumerator(difference.numerator);
        this.setDenominator(difference.denominator);
        this.reduce();
        return this;
    }

    /**
     * multiply.
     */
    public Solution multiply(Solution x) {
        Solution product = new Solution(1, 1);
        product.setNumerator(this.numerator * x.numerator);
        product.setDenominator(this.denominator * x.denominator);
        this.setNumerator(product.numerator);
        this.setDenominator(product.denominator);
        this.reduce();
        return this;
    }

    /**
     * divide.
     */
    public Solution divide(Solution x) {
        Solution quotient = new Solution(1, 1);
        if (x.numerator != 0) {
            quotient.setNumerator(this.numerator * x.denominator);
            quotient.setDenominator(this.denominator * x.numerator);
            this.setNumerator(quotient.numerator);
            this.setDenominator(quotient.denominator);
            this.reduce();
        }
        return this;
    }

    /**
     * equals.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            this.reduce();
            other.reduce();
            if (this.numerator == other.numerator && this.denominator == other.denominator) {
                return true;
            }
            return false;
        }
        return false;
    }
}