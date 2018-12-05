import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Solution653 {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        TreeNode<Integer> treeNode = new TreeNode<>(a);
        System.out.println(new Solution653().findTarget(treeNode.root, 4));
    }

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet();
        return find(root, k, set);
    }

    public boolean find(TreeNode root, int count, Set set) {
        if (root == null) {
            return false;
        }
        if (set.contains(count - root.val)) {
            return true;
        }
        set.add(root.val);
        return find(root.left, count, set) | find(root.right, count, set);
    }
}
