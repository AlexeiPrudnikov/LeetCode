public class Main {
    public static boolean isBadVersion(int n) {
        boolean[] versions = {false, true};
        return versions[n-1];
    }
    public static int firstBadVersion(int n) {
        int leftIndex = 1;
        int rightIndex = n;
        int index = n;
        if (n == 1)
        {
            if (isBadVersion(1)) return 1;
            else {
                return -1;
            }
        }

        while (!(isBadVersion(index) && !isBadVersion(index -1))){
            if (isBadVersion(index)) {
                rightIndex = index;
            }
            else {
                leftIndex = index;
            }
            index = (rightIndex - leftIndex) / 2 + leftIndex;
        }
        return index;
    }
    public static boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        boolean result = true;
        for(int i = 0; i<= num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)){
                return false;
            }
        }
        return result;
    }
    public static boolean isPalindrome2(int x) {
        String num = Integer.toString(x);
        String reverse = new StringBuilder(num).reverse().toString();
        return num.equals(reverse);
    }
    public static void main(String[] args) {
        int i = 131;
        System.out.println(isPalindrome2(i));
       // System.out.println(firstBadVersion(2));

    }
}