public class Main {
    public int hammingWeight(int n) {
        String binNumber = Integer.toBinaryString(n);
        int count = 0;
        for (char ch: binNumber.toCharArray()) {
            if (ch == '1') count++;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}