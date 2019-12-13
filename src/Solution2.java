/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * Related Topics
 * 链表
 * 数学
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] a = {1, 9,4};
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
