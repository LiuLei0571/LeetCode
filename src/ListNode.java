import java.util.Stack;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode(int[] arr) {
        this.val = arr[0];
        ListNode listNode = this;
        for (int i = 1; i < arr.length; i++) {
            listNode.next = new ListNode(arr[i]);
            listNode = listNode.next;
        }
    }

    //尾插法
    public ListNode listNode1(int[] arr) {
        ListNode listNode = this;
        for (int i = 0; i < arr.length; i++) {
            listNode.next = new ListNode(arr[i]);
            listNode = listNode.next;
        }
        return listNode;
    }
    //头插法
    public ListNode listNode2(int[] arr) {
        ListNode listNode = this;
        for (int i = 0; i < arr.length; i++) {
            ListNode node=new ListNode(arr[i]);
            node.next=listNode.next;
            listNode.next=node;
        }
        return listNode;
    }

//    //快慢指针来处理，如果有环，快指针总有一天会和慢指针重复的
    public boolean hasCycle() {
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode cur=this;
        while (cur != null) {
            stringBuilder.append(cur.val + "->");
            cur = cur.next;
        }
        return stringBuilder.toString();
    }
}