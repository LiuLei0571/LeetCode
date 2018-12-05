import javax.swing.tree.TreeNode;

public class SolutionHead {
    public static ListNode removeElements(ListNode head, int val) {
        //虚拟头结点
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        while (pre.next != null) {
            if (pre.next.val == val) {
                ListNode node = pre.next;
                pre.next = node.next;
                node.next = null;
            } else {
                pre = pre.next;
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4,4,3,2};
        ListNode listNode = new ListNode(0);
        ListNode node=new ListNode(0);
        listNode.listNode1(a);
        removeElements(listNode,4);
        System.out.println(listNode.toString());
    }
}
