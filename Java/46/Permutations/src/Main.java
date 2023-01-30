import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> help = null;
        List<Integer> row;
        List<Integer> temp;
        for (int num : nums) {
            row = new ArrayList<>();
            if (list.size() == 0) {
                row.add(num);
                list.add(row);
            } else {
                help = new ArrayList<>();
                for (int i = 0; i < list.size(); i++) {
                    row = new ArrayList<>(list.get(i));
                    for (int j = 0; j <= row.size(); j++) {
                        temp = new ArrayList<>(row);
                        temp.add(j, num);
                        help.add(temp);
                    }
                }
                list = help;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        permute(new int[] {1,2,3,4,5});
    }
}
