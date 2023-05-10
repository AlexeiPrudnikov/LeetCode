public class Main {
    public static ListNode swapPairs(ListNode head) {
        ListNode result = head;
        if (head == null) {
            return null;
        }
        boolean flag = true;
        int temp = 0;
        ListNode first = head;
        ListNode second;
        while (flag) {
            if (first.next != null) {
                second = first.next;
                temp = first.val;
                first.val = second.val;
                second.val = temp;
                if (second.next == null) {
                    flag = false;
                } else {
                    first = second.next;
                }
            } else {
                flag = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}