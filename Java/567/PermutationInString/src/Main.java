import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static HashMap<Character, Integer> getStrHash(String str) {
        HashMap<Character, Integer> result = new HashMap<>();
        for (Character c : str.toCharArray()) {
            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }
        return result;
    }

    /*
    public static String sortString (String str) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        Collections.sort(list);
        return list.stream().map(Objects::toString).collect(Collectors.joining(""));

    }
    public static boolean checkInclusion(String s1, String s2) {
        String sortS1 = sortString(s1);
        int lenS1 = s1.length();
        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            if (sortS1.equals(sortString(s2.substring(i,i + lenS1)))) {
                return true;
            }
        }
        return false;
    }
    */
    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> hashS1 = getStrHash(s1);
        int lenS1 = s1.length();
        HashMap<Character, Integer> hashsubS2;
        boolean equalsHash;
        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            equalsHash = true;
            hashsubS2 = getStrHash(s2.substring(i, i + lenS1));
            if (hashS1.size() == hashsubS2.size()) {
                for (Character key : hashS1.keySet()) {
                    if (!hashS1.get(key).equals(hashsubS2.get(key))) {
                        equalsHash = false;
                        break;
                    }
                }
                if (equalsHash) return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abc";
        HashMap<Character, Integer> result = getStrHash(s);
        System.out.println(checkInclusion("abc", "qweqabdcweqwe"));
    }
}