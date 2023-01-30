public class Main {
    public static String reverseWord(String str){
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >=0 ; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static String reverseWords(String s) {
    StringBuilder result = new StringBuilder();
    String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            result.append(reverseWord(words[i]));
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
    return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("God Ding"));
        System.out.println("Hello world!");
    }
}