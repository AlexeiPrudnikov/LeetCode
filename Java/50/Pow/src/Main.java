public class Main {
    public static double myPow(double x, long n) {
        if (n == 0) return 1;
        if (x == 1) return 1;
        double result = x;
        int i = 1;
       while (i < Math.abs(n)) {
            if (i * 2 > 0 && i * 2 <= n) {
                result *= result;
                i = i * 2;
            }
            else {
                result *= x;
                i++;
            }
        }
        if (n < 0) {
            result = 1 / result;
        }
        return result;
    }
    public static double myPow(double x, int n) {
        return myPow(x, n);
    }
    public static void main(String[] args) {
        System.out.println(myPow(1,2147483647));
    }
}