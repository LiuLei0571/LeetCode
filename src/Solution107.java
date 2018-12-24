import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution107 {


    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> listStack = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return listStack;
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
            listStack.add(mList);
        }
        while (!listStack.isEmpty()) {
            result.add(listStack.pop());
        }
        return result;
    }
}
