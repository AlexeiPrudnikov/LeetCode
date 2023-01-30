public class Main {
    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode left = head;
        ListNode right = head.next;
        ListNode current = right;
        if (right.next != null){
            right = right.next;
        }
        left.next = null;
        while (current.next != null){
            current.next = left;
            left = current;
            current = right;
            if (right.next != null){
                right = right.next;
            }
        }
        right.next = left;
        return right;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        node = reverseList(node);
        System.out.println("Hello world!");
    }
}