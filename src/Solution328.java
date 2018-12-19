//给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
public class Solution328 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        ListNode ls = new ListNode(a);
        System.out.println(new Solution328().oddEvenList(ls).toString());
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode pre = head;

        ListNode old = new ListNode(0);
        ListNode oldHead = old;

        ListNode even = new ListNode(0);
        ListNode evenHead = even;

        int index = 1;
        while (pre != null) {
            if (index % 2 == 0) {
                oldHead.next = new ListNode(pre.val);
                oldHead = oldHead.next;
            } else {
                evenHead.next = new ListNode(pre.val);
                evenHead = evenHead.next;
            }
            pre = pre.next;
            index++;
        }
        evenHead.next = old.next;
        return even.next;
    }

//
//    public ListNode oddEvenList(ListNode head) {
//        if (head==null||head.next==null){
//            return head;
//        }
//
//        //奇数
//        ListNode odd = head;
//        //偶数
//        ListNode even = head.next;
//        ListNode evenHead = even;
//        boolean flag = false;
//        while (even.next != null) {
//            odd.next = even.next;
//            odd = even;
//            even = even.next;
//            flag = !flag;
//        }
//        if (flag) {
//            even.next = evenHead;
//            odd.next = null;
//        } else {
//            odd.next = evenHead;
//        }
//        return head;
//    }
}

