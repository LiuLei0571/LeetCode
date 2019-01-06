import java.util.Stack;

public class Solution114 {
    public static void main(String[] args) {
        int[] a = new int[]{5, 2, 4, 1, 8, 6, 9};
        TreeNode treeNode = new TreeNode(a);
        new Solution114().flatten(treeNode.root);
    }

    private TreeNode lastNode = null;

    //前序遍历
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        if (lastNode != null) {
            lastNode.right = root;
            lastNode.left = null;
        }
        lastNode = root;
        TreeNode right = root.right;
        flatten(root.left);
        flatten(right);
    }
    // 栈的方法，输出结果不对
//    public void flatten(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        Stack<TreeNode> stack = new Stack();
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.pop();
//
//            if (node.left != null) {
//                stack.push(node.left);
//            }
//            if (node.right != null) {
//                stack.push(node.right);
//            }
//            if (!stack.isEmpty()) {
//                node.right = stack.peek();
//            }
//            node.left = null;
//        }
//    }
}
