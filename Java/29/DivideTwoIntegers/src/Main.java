public class Main {
    public static int divide(int dividend, int divisor) {
        if (divisor == 1) return dividend;
        if (divisor == -1) {
            long result = dividend - dividend;
            result -= dividend;
            if (result > 2147483647) return 2147483647;
            if (result < -2147483648) return -2147483648;
            return (int)result;
        }
        long posDividend = Math.abs((long) dividend);
        long posDivisor = Math.abs((long)divisor);
        long currentSumm = posDivisor;
        long result = 0;
        if (posDivisor > posDividend) return 0;
        while (currentSumm <= posDividend) {
            result++;
            currentSumm += posDivisor;
        }
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            result = result - result - result;
        }
        if (result > 2147483647) return 2147483647;
        if (result < -2147483648) return -2147483648;
        return (int)result;
    }

    public static void main(String[] args) {
       // System.out.println(divide(-2147483648, 1));
        System.out.println(divide(-3 ,-1));
    }
}