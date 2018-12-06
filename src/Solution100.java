/**
 * Created by liulei on 2018/12/5.
 */
public class Solution100 {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int[] b = {2, 1, 4};
        TreeNode t1 = new TreeNode(a);
        TreeNode t2 = new TreeNode(b);
        System.out.println(new Solution100().isSameTree(t1.root, t2.root));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null && q == null || !(p == null || q == null) && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
