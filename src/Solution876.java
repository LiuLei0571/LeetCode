public class Solution876 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        ListNode listNode=new ListNode(a);
        System.out.println(new Solution876().middleNode(listNode));
    }

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
}
