public class Main {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode current = null;
        ListNode result = null;
        int index =-1;
        boolean isNotEmpty = true;
        while (isNotEmpty) {
            index = -1;
            isNotEmpty = false;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null ) {
                    if (index == -1) {
                        index = i;
                    } else {
                        if (lists[i].val < lists[index].val) {
                            index = i;
                        }
                    }
                    isNotEmpty = true;
                }
            }
            if(isNotEmpty) {
                if (current != null) {
                    current.next = new ListNode(lists[index].val);
                    current = current.next;
                } else {
                    current = new ListNode(lists[index].val);
                    result = current;
                }
                lists[index] = lists[index].next;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        lists[2] = new ListNode(2, new ListNode(6));
        mergeKLists(lists);
        System.out.println("Hello world!");
    }
}