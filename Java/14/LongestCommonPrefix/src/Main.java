public class Main {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        boolean isEqual = true;
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLength){
                minLength = strs[i].length();
            }
        }
        char currentChar;
        for (int i = 0; i < minLength; i++) {
            currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (currentChar != strs[j].charAt(i)){
                    return result.toString();
                }
            }
            result.append(currentChar);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String[] words = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(words));
    }
}