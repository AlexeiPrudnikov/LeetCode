import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s.equals("")) return 0;
        int maxLength = 1;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                if (hashMap.size() > maxLength) {
                    maxLength = hashMap.size();
                }
                i = hashMap.get(s.charAt(i)) + 1;
                hashMap.clear();
            }
            hashMap.put(s.charAt(i), i);
        }
        if (hashMap.size() > maxLength) {
            maxLength = hashMap.size();
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "asdsf";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
