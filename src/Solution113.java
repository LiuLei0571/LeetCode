import java.util.ArrayList;
import java.util.List;

/**
 * Created by liulei on 2019/1/9.
 */
public class Solution113 {
    public static void main(String[] args) {
        int[] a = {2, 1, 4, 5, 3};
        TreeNode<Integer> root = new TreeNode<>(a);
        System.out.println(new Solution113().pathSum(root.root,3));
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> temp = new ArrayList<Integer>();

        pathSum(root, lists, sum, temp);

        return lists;
    }

    public void pathSum(TreeNode root, List<List<Integer>> lists, int sum, List<Integer> temp) {

        if (root == null) {
            return;
        }
        temp.add(root.val);

        if (root.right == null && root.left == null) {
            lists.add(temp);
        }
        pathSum(root.left, lists, sum, temp);
        pathSum(root.right, lists, sum, temp);

    }
}
