import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode temp = head;
        List<ListNode> list = new ArrayList<>();
        int count = 0;
        while (temp != null) {
            count++;
            list.add(temp);
            temp = temp.next;
        }
        if (count - n == 0) {
            if (count == 1) {
                return null;
            } else {
                head = head.next;
                return head;
            }
        } else if (count - n < 0) {

            return null;
        } else if (n == 1) {
            list.get(list.size() - 2).next = null;
        } else {
            ListNode modify = list.get(count - n - 1);
            modify.next = list.get(count - n + 1);
        }

        return head;

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        //ListNode node = new ListNode(1, new ListNode(2));
        //ListNode node = new ListNode(1);
        System.out.println(removeNthFromEnd(node, 2).toString());
    }
}