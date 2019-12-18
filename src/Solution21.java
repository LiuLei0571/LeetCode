public class Solution21 {
    public static void main(String[] args) {
        int a[] = {1, 2, 5,8};
        int b[] = {2, 1, 3, 4};
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
}
