import java.util.ArrayList;

/**
 * Created by liulei on 2020/3/11.
 */
public class Sword06 {
    public static void main(String[] args) {
        ListNode listNode=new ListNode(new int[]{1,2,3,4,5});
        System.out.println(new Sword06().reversePrint(listNode));
    }
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[]{};
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        reversePrint(head, list);
        int[] result=new int[list.size()];
        for (int i = 0; i <result.length ; i++) {
            result[i]=list.get(i);
        }
         return result;
    }
    public void reversePrint(ListNode head,ArrayList list) {

         if (head.next!=null) {
            reversePrint(head.next,list);
        }
        list.add(head.val);
     }
}
