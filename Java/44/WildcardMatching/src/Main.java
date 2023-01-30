import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isMatch(String s, String p) {
        String temp = p.replaceAll("[?]", "[a-z]");
        String regexP = temp.replaceAll("[*]+", "[a-z]\\*");
        return s.matches(regexP);
    }
    public static boolean isMatch2(String s, String p) {
        String temp = p.replaceAll("[?]", "[a-z]");
        String regexP = temp.replaceAll("[*]+", "[a-z]\\*");
        Pattern pattern = Pattern.compile(regexP);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
    public static void main(String[] args) {
        System.out.println(isMatch2("abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb",
                "**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb*bb**a*b*bb"));
    }
}