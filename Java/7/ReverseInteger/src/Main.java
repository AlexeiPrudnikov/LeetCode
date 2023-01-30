public class Main {
    public static long reverse(int x) {
        long result = 0;
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x *= -1;
        }
        while (x > 0){
            result = result * 10 + x % 10;
            x /= 10;
        }
        if (negative) {
            result *= -1;
        }
        try {
            return Math.toIntExact(result);
        }
        catch (ArithmeticException e)
        {
            return 0;
        }

    }
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}