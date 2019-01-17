/**
 * Created by liulei on 2019/1/9.
 */
public class Solution112 {
    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 5};
        TreeNode treeNode = new TreeNode(a);
        System.out.println(new Solution112().hasPathSum(treeNode.root, 5));
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

    }

}
