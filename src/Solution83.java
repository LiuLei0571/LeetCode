public class Solution83 {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3};
        ListNode listNode = new ListNode(a);
        System.out.println(new Solution83().deleteDuplicates(listNode));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;

        while (cur != null) {
            if (cur.val == pre.val) {
                pre.next=cur.next;
            }else {
                pre=pre.next;
            }
            cur=cur.next;
        }


        return head;
    }
}
