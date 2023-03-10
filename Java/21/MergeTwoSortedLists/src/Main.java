public class Main {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode result = new ListNode();
        ListNode temp = result;
        if (list1.val < list2.val) {
            temp.val = list1.val;
            list1 = list1.next;
        }
        else {
            temp.val = list2.val;
            list2 = list2.next;
        }
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                temp.next = list2;
                return result;
            }
            if(list2 == null) {
                temp.next = list1;
                return result;
            }
            if (list1.val < list2.val) {
                temp.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else {
                temp.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            temp = temp.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = mergeTwoLists(node1, node2);
        System.out.println("Hello world!");
    }
}