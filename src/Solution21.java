public class Solution21 {
    public static void main(String[] args) {
        int a[] = {1, 2, 4};
        int b[] = {1, 3, 4, 6};
        ListNode l1 = new ListNode(a);
        ListNode l2 = new ListNode(b);
        System.out.println(new Solution21().mergeTwoLists(l1, l2).toString());
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = null;

        if (l1.val < l2.val) {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }

//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2==null){
//            return l1;
//        }
//        ListNode node = null;
//        ListNode head = null;
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                if (node == null) {
//                    node = new ListNode(l1.val);
//                    head = node;
//                } else {
//                    node.next = new ListNode(l1.val);
//                    node = node.next;
//                }
//                l1 = l1.next;
//
//            } else {
//                if (node == null) {
//                    node = new ListNode(l2.val);
//                    head = node;
//                } else {
//                    node.next = new ListNode(l2.val);
//                    node = node.next;
//                }
//                l2 = l2.next;
//            }
//
//        }
//        if (l1 != null ) {
//            node.next = l1;
//        } else if (l2 !=null ) {
//            node.next = l2;
//        }
//        return head;
//    }
}
