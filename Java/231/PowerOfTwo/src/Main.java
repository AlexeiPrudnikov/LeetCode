public class Main {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        while (n > 1) {
            if (n % 2 == 1) {
                return false;
            } else {
                n /= 2;
            }
        }
        return true;
    }
    public static boolean isPowerOfTwo2(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        String bitNumber = Integer.toBinaryString(n);
        int count = bitNumber.length() - bitNumber.replace("1", "").length();
        if (count == 1) return true;
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo2(6));
    }
}