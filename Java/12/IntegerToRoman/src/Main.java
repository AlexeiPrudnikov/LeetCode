import java.util.HashMap;

public class Main {
    public static String intToRoman(int num) {
        HashMap<Integer, String> roman = new HashMap<>();
        roman.put(1, "I");
        roman.put(4, "IV");
        roman.put(5, "V");
        roman.put(9, "IX");
        roman.put(10, "X");
        roman.put(40, "XL");
        roman.put(50, "L");
        roman.put(90, "XC");
        roman.put(100, "C");
        roman.put(400, "CD");
        roman.put(500, "D");
        roman.put(900, "CM");
        roman.put(1000, "M");
        String result = "";
        int temp = num;
        int maxKey;
        while (temp > 0) {
            maxKey = 0;
            for (Integer key: roman.keySet()) {
                if (maxKey < key && temp - key >= 0) {
                    maxKey = key;
                }
            }
            result += roman.get(maxKey);
            temp -= maxKey;
        }

        return result;
    }
    public static void main(String[] args) {

        System.out.println(intToRoman(12));
    }
}