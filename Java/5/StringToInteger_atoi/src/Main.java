public class Main {
    public static int myAtoi(String s) {

        String result = s.trim();
        char[] sim = result.toCharArray();
        boolean exit = false;
        int index = 0;
        boolean isOpen = false;
        boolean isOpenNum = false;
        result = "";
        while (index < sim.length && !exit) {
            if (sim[index] == '-' || sim[index] == '+') {
                if (!isOpen) {
                    result = "";
                    result += sim[index];
                    isOpen = true;
                } else {
                    exit = true;
                }
            } else {
                if (sim[index] >= 48 && sim[index] <= 57) {
                    if (isOpenNum) {
                        result += sim[index];
                    } else {
                        if (sim[index] != 48) {

                            result += sim[index];
                            isOpenNum = true;
                        }

                        isOpen = true;
                    }
                } else {
                    if (result.length() == 0) return 0;
                    else break;
                }
            }

            index++;
        }
        try {
            if (result.length() > 11) {
                if (result.charAt(0) == '-') {
                    return -2147483648;
                } else {
                    return 2147483647;
                }
            }
            long num = Long.parseLong(result);
            if (num < -2147483648) num = -2147483648;
            if (num > 2147483647) num = 2147483647;
            return (int) num;
        }
        catch (Exception ex){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483647"));

    }
}