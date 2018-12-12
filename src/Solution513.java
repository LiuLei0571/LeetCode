import java.util.*;

public class Solution513 {
    public static void main(String[] args) {
        int[] a = {4, 2, 1};
        TreeNode treeNode = new TreeNode(a);
        System.out.println(new Solution513().findBottomLeftValue(treeNode.root));
    }

    public int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int temp = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == 0) {
                    temp = node.val;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return temp;
    }


    TreeNode dfs(TreeNode treeNode, int depth, int maxDepth) {
        if (treeNode == null) {
            return null;
        }
        if (depth > maxDepth) {
            maxDepth = depth;
        }
        if (treeNode.left != null) {
            dfs(treeNode.left, depth + 1, maxDepth);
        }
        if (treeNode.right != null) {
            dfs(treeNode.right, depth + 1, maxDepth);

        }
        return treeNode;
    }
}
