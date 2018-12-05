public class Solution617 {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 5};
        int[] b = {2, 1, 3, 4};
        TreeNode t1 = new TreeNode(a);
        TreeNode t2 = new TreeNode(b);
        System.out.println(new Solution617().mergeTrees(t1.root, t2.root).toString());
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        if (t1 == null && t2 != null) {
            return t2;
        }
        if (t1 != null && t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    public TreeNode mergeTrees(TreeNode root, TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t2;
        }

        root.val = t1.val + t2.val;
        root.left = mergeTrees(root, t1.left, t2.left);
        root.right = mergeTrees(root, t1.right, t2.right);
        return root;
    }
}
