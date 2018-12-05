public class Solution203 {
    //对一个链表的，删除
    public static ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }
        head.next=removeElements(head.next,val);
        if (head.val==val){
            return head.next;
        }else {
            return head;
        }

//        // 头结点后面的链表，删除元素的新链表，head.next代表是除去头节点的新的链表
//        ListNode rs=removeElements(head.next,val);
//        //此时head节点的值
//        if (head.val==val) {
//            //除去head的新的链表
//            return rs;
//        }else {
//            //如果未删除，新的链表是：头结点又连接上之前的链表
//            head.next=rs;
//            return head;
//        }

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
