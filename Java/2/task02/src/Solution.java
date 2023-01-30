public class Solution {
    public static int[] sumToArray(int a, int b, int c) {
        int[] result = new int[2];
        result[0] = (a + b + c) % 10;
        result[1] = (a + b + c) / 10;
        return result;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode currentNode = result;
        ListNode newNode = result;
        int a = 0;
        int b = 0;
        int transfer = 0;
        int[] sumArray;
        boolean first = true;
        while (l1 != null || l2 != null) {
            if (!first) {
                newNode = new ListNode();
                currentNode.next = newNode;
                currentNode = currentNode.next;
            }
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            } else {
                a = 0;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            } else {
                b = 0;
            }
            sumArray = sumToArray(a, b, transfer);
            currentNode.val = sumArray[0];
            transfer = sumArray[1];
            first = false;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l2 = new ListNode(9, new ListNode(9));
        addTwoNumbers(l1, l2);
    }
}
