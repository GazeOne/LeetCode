package interview150;

public class _50MyPow {

    public double myPow(double x, int n) {
        double result = 1;
        boolean nLess0 = n < 0;

        if (n == 0) {
            return 1;
        } else {
            n = Math.abs(n);
            while (n > 0) {
                result *= x;
                n--;
            }
        }

        if (nLess0 && result != 0) result = 1 / result;

        return result;
    }

    public double myPow3(double x, int n) {
        boolean nLess0 = n < 0;

        double result = myPow2(x, Math.abs(n));

        if (nLess0 && result != 0) result = 1 / result;

        return result;
    }


    public double myPow2(double x, int n) {

        if (n == 0) {
            return 1.0;
        }
        double half = myPow2(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

}
