import java.util.ArrayList;
import java.util.List;

public class Solution98 {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        TreeNode<Integer> mt = new TreeNode<Integer>(a);
        System.out.println(new Solution98().isValidBST(mt.root));
    }

    public boolean isValidBST(TreeNode root) {

        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    public boolean isValidBST(TreeNode root, int min, int max) {

        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);

    }


    public void getBST(TreeNode root, List<Integer> mList) {
        if (root == null) {
            return;
        }
        getBST(root.left, mList);
        mList.add(root.val);
        getBST(root.right, mList);
    }
}
