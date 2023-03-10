public class Main {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}