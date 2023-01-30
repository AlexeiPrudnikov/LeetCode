import java.util.Arrays;

public class Main {
    public static int reverseBits(int n) {

        int[] inBits = new int[32];
        int index = 31;
        long result = 0;
        while (n > 0) {
            inBits[index] = n % 2;
            n = n / 2;
            index--;
        }
        int help = 0;
        for (int i = 0; i < inBits.length / 2; i++) {
            help = inBits[i];
            inBits[i] = inBits[inBits.length - i - 1];
            inBits[inBits.length - i - 1] = help;
        }
        String str = Arrays.stream(inBits)
                .mapToObj(String::valueOf)
                .reduce((x, y) -> x +  y)
                .get();
        /*
        long mult = 1;
        for (int i = inBits.length - 1; i >= 0 ; i--) {
            result = inBits[i] * mult + result;
            mult *= 2;
        }
         */

        return (int)Long.parseLong(str,2);
    }
    public static int reverseBits2(int n) {
        String binNumber = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(binNumber);
        binNumber = sb.reverse().toString();
        int result = (int)Long.parseLong(binNumber, 2);
        return result << (32 - binNumber.length());
    }
    public static int reverseBits3(int n) {
        StringBuilder sb = new StringBuilder();
        if (n < 0) n = Math.abs(n) + 1;
        while (n > 0){
            sb.append(n % 2);
            n /= 2;
        }
        String binNumber = sb.toString();
        int result = Integer.parseInt(binNumber, 2);
        return result << (32 - binNumber.length());
       // return (int)Long.parseLong(s, 2);
    }
    public static void main(String[] args) {
        System.out.println(reverseBits3(10));
        System.out.println("Hello world!");
    }
}