/**
 * Created by liulei on 2020/3/21.
 */
public class Solution101 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(new int[]{1, 2, 2, 3, 4, 4, 3});
    }

    public boolean isSymmetric(TreeNode root) {

        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode leftTree, TreeNode rightTree) {
        if (leftTree == null && rightTree == null) {
            return true;
        }
        if (leftTree == null || rightTree == null) {
            return false;
        }
        return leftTree.val == rightTree.val && isMirror(leftTree.left, rightTree.right) && isMirror(leftTree.right, rightTree.left);
    }
}
