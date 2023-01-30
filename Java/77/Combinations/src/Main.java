import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void combine (List<List<Integer>> result, int start, int n, int k, int value) {
        for (int i = 0; i < result.size(); i++) {

        }
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        if (k > n) return null;
        //nextCortege(result, 1, n, k);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(7);
        combine(20,16);
       // System.out.println(list.contains(31));
    }
}