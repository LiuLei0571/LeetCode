import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//给定一个二叉树，返回其节点值的锯齿形层次遍历。
//给定二叉树 [3,9,20,null,null,15,7],
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//返回锯齿形层次遍历如下：
//
//[
//  [3],
//  [20,9],
//  [15,7]
//]
public class Solution103 {

    public static void main(String[] args) {
        int[] a = {3,1,2,5,4};
        TreeNode treeNode = new TreeNode(a);
        System.out.println(new Solution103().zigzagLevelOrder(treeNode));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> mList = new ArrayList<>();
        zigzagLevelOrder(root, mList);
        return mList;
    }

    private void zigzagLevelOrder(TreeNode root, List<List<Integer>> mList) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(root.val);

    }


}
