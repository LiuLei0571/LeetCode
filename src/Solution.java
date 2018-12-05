import java.util.List;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        //删除要删除的数字是在头结点的情况
        while (head != null && head.val == val) {
            ListNode node = head;
            head = head.next;
            node.next = null;
        }
        ListNode pre = head;
        while (pre.next != null) {
            if (pre.next.val == val) {
                ListNode node = pre.next;
                pre.next = node.next;
                node.next = null;
            } else {
                pre = pre.next;
            }
        }
        return head;
    }
}
