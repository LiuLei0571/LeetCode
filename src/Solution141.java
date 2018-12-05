public class Solution141 {
    public static void main(String[] args) {
        int[] a = {1, 2,3,4,5};
        ListNode listNode = new ListNode(0);
        listNode.listNode1(a);

        System.out.println(new Solution141().hasCycle(listNode)+"");
    }
    //快慢指针来处理，如果有环，快指针总有一天会和慢指针重复的
    public   boolean hasCycle(ListNode next) {
        if (next == null || next.next == null) {
            return false;
        }
        ListNode head = next;
        ListNode tail = next;
        while (tail != null && tail.next != null) {

            head = head.next;
            tail = tail.next.next;
            if (head == tail) {
                return true;
            }
        }

        return false;
    }
}
