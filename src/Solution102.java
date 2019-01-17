import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Solution102 {
    public static void main(String[] args) {
        int[] a = {4, 2, 1, 3, 10, 6, 9, 8, 5};
        TreeNode treeNode = new TreeNode(a);
        new Solution102().levelOrder(treeNode.root);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.push(root);
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
            result.add(mList);
        }

        return result;
    }
}
