import java.util.ArrayList;
import java.util.List;

//请判断一个链表是否为回文链表。
//示例 1:
//
//输入: 1->2
//输出: false
//示例 2:
//
//输入: 1->2->2->1
//输出: true
//考虑O(1)与O(n)的复杂度
public class Solution234 {
    public static void main(String[] args) {
        int[] a = {1};
        ListNode listNode = new ListNode(a);
        System.out.println(new Solution234().isPalindrome(listNode));
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = slow.next;
        ListNode pre = head;
        //后半段链表，链表已经反转
        pre = getListNode(fast);
        while (pre != null) {
            if (pre.val != head.val) {
                return false;
            }
            pre = pre.next;
            head = head.next;
        }
        return true;
    }

    private ListNode getListNode(ListNode head) {
        ListNode pre = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
