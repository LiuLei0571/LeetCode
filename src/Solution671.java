import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;

public class Solution671 {
    public static void main(String[] args) {
        int[] a = {6, 4, 3, 6, 8, 9, 7};
        TreeNode treeNode = new TreeNode(a);
        System.out.println(new Solution671().findSecondMinimumValue(treeNode.root));
    }

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pop();
            treeSet.add(treeNode.val);
            if (treeNode.right != null) {
                stack.push(treeNode.right);
            }
            if (treeNode.left != null) {
                stack.push(treeNode.left);
            }
        }

        if (treeSet.size() > 1) {
            int temp = 1;
            int index = 0;
            for (Integer integer : treeSet) {

                index++;
                temp = integer;
                if (index == 2) {
                    return temp;
                }
            }
        }
        return -1;
    }

}
