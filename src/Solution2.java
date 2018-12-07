public class Solution2 {
    public static void main(String[] args) {
        int[] a = {1, 2,4};
        int[] b = {2, 3, 9};
        ListNode l1 = new ListNode(a);
        ListNode l2 = new ListNode(b);
        System.out.println(new Solution2().addTwoNumbers(l1, l2).toString());
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                head.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                head.val += l2.val;
                l2 = l2.next;
            }
            if (head.val < 10) {
                if (!(l1 == null && l2 == null)) {
                    head.next = new ListNode(0);

                }
            } else {
                head.next = new ListNode(1);
                head.val = head.val % 10;
            }
            head = head.next;
        }


        return result;
    }
}
