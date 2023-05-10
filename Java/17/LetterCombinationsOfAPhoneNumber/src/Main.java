import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printArray (char[] letters){
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
        System.out.println();
    }
    public static char[] getLetter(int digit){
        char[] letters = null;
        int shift = 0;
        switch (digit){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
                letters = new char[3];
                break;
            case 7:
            case 9:
                letters = new char[4];
                break;
        }
        if (digit == 8 || digit == 9){
            shift = 1;
        }
        for (int i = 0; i < letters.length; i++) {
            letters[i] =(char) ((digit - 2) * 3 + 97 + i + shift);
        }
        return letters;
    }
    public static List<String> getSubCombinations (List<String> combine, int digit) {
        List<String> result = new ArrayList<>();
        char[] letters = getLetter(digit);
        String str = "";
        if (combine == null) {
            for (int i = 0; i < letters.length; i++) {
                result.add(String.valueOf(letters[i]));
            }
        } else {
            for (int i = 0; i < combine.size(); i++) {
                str = combine.get(i);
                for (int j = 0; j < letters.length; j++) {
                    result.add(String.valueOf(letters[j]) + str);
                }
            }
        }
        return result;
    }
    public static List<String> letterCombinations(String digits) {
        try {
        int digit = Integer.valueOf(digits);
        List<String> result = null;
        while (digit > 0){
            result = getSubCombinations(result, digit % 10);
            digit /= 10;
        }
        return result;}
        catch (Exception ex) {
            List<String> result = new ArrayList<>();
            return result;
        }
    }
    public static void main(String[] args) {
    letterCombinations("");
    }
}