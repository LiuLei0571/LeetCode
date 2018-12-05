import java.util.Stack;

public class Solution206 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        ListNode listNode = new ListNode(a);

        System.out.println(new Solution206().reverseList(listNode).toString());
    }

//    public ListNode reverseList(ListNode head) {
//
//        if (head == null||head.next==null) {
//            return head;
//        }
//        ListNode h=reverseList(head.next);
//        head.next.next=head;
//        head.next=null;
//        return h;
//
//
//    }


    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;


    }
//    public ListNode reverseList(ListNode head) {
//        Stack<Integer> stack = new Stack<>();
//        while (head != null) {
//            stack.push(head.val);
//            head = head.next;
//        }
//        ListNode listNode = null;
//        ListNode pre = null;
//        while (!stack.isEmpty()) {
//            if (listNode == null) {
//                listNode = new ListNode(stack.pop());
//                pre = listNode;
//            } else {
//                ListNode node = new ListNode(stack.pop());
//                while (pre.next != null) {
//                    pre = pre.next;
//                }
//                node.next = pre.next;
//                pre.next = node;
//            }
//
//        }
//        return listNode;
//    }
}
