public class Main {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        ListNode current = head;
        if (head == null){
            return head;
        }
        while (current.next != null) {
            if (current.val != current.next.val) {
                current = current.next;
            } else {
                current.next = current.next.next;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}