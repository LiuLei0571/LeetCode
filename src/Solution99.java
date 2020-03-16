public class Solution99 {
    TreeNode x = null, y = null, pred = null;

    public void recoverTree(TreeNode root) {

        findSwapTree(root);
        swap(x, y);
    }

    public void findSwapTree(TreeNode root) {
        if (root == null) {
            return;
        }
        findSwapTree(root.left);
        if (pred != null && root.val < pred.val) {
            y = root;
            if (x == null) {
                x = pred;
            } else {
                return;
            }
        }
        pred = root;
        findSwapTree(root.right);

    }

    public void swap(TreeNode a, TreeNode b) {
        int tmp = a.val;
        a.val = b.val;
        b.val = tmp;
    }

}
