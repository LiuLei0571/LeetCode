import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
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
        int[] a = {3, 1, 2, 5, 4};
        TreeNode treeNode = new TreeNode(a);
        System.out.println(new Solution103().zigzagLevelOrder(treeNode.root));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.push(root);
        int count=0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> mList = new ArrayList<>();
            for (int i = 0; i < size; i++) {

                if (queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                mList.add(queue.poll().val);
            }
            if (count%2!=0){
                Collections.reverse(mList);
            }
            count++;
            result.add(mList);
        }
        return result;
    }

}
