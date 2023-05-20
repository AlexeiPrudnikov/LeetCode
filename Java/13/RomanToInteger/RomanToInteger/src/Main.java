import java.util.HashMap;

public class Main {
    public static int romanToInt(String s) {
        HashMap<String, Integer> romanNumMap = new HashMap<>();
        romanNumMap.put("I", 1);
        romanNumMap.put("IV", 4);
        romanNumMap.put("V", 5);
        romanNumMap.put("IX", 9);
        romanNumMap.put("X", 10);
        romanNumMap.put("XL", 40);
        romanNumMap.put("L", 50);
        romanNumMap.put("XC", 90);
        romanNumMap.put("C", 100);
        romanNumMap.put("CD", 400);
        romanNumMap.put("D", 500);
        romanNumMap.put("CM", 900);
        romanNumMap.put("M", 1000);
        String romanNumber = s.toUpperCase();
        int result = 0;
        int i = 0;
        String temp;
        int tempMaxInt = 1000;
        int tempInt = 0;
        while (i < romanNumber.length()) {
            if (i < romanNumber.length() - 1) {
                temp = romanNumber.substring(i, i + 2);
                if (romanNumMap.containsKey(temp)) {
                    tempInt = romanNumMap.get(temp);
                    if (tempInt > tempMaxInt) {
                        return -1;
                    }
                    i += 2;
                } else {
                    temp = String.valueOf(romanNumber.charAt(i));
                    if (romanNumMap.containsKey(temp)) {
                        tempInt = romanNumMap.get(temp);
                        if (tempInt > tempMaxInt) {
                            return -1;
                        }
                        i++;
                    }
                }
            } else {
                temp = String.valueOf(romanNumber.charAt(i));
                if (romanNumMap.containsKey(temp)) {
                    tempInt = romanNumMap.get(temp);
                    if (tempInt > tempMaxInt) {
                        return -1;
                    }
                }
                i++;
            }
            if (tempInt == 0) {
                return -1;
            }
            if (tempInt < tempMaxInt) {
                tempMaxInt = tempInt;
            }
            result += tempInt;
            tempInt = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
}