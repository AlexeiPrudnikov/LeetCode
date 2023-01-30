public class Main {
    public static ListNode middleNode(ListNode head) {
    int count = 0;
    ListNode result = head;
    while (result != null) {
        count++;
        result = result.next;
    }
    count = count / 2;
    result = head;
        for (int i = 0; i < count ; i++) {
            result = result.next;
        }
    return result;
    }
    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(middleNode(node).toString());
    }
}