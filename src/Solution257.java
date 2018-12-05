import java.util.ArrayList;
import java.util.List;

public class Solution257 {
    public static void main(String[] args) {
        int[] a = {2, 1, 4, 5, 3};
        TreeNode<Integer> root = new TreeNode<>(a);
        System.out.println(new Solution257().binaryTreePaths(root.root));
    }

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> mList = new ArrayList<>();
        mList = (ArrayList<String>) binaryTreePath(root, mList, "");
        return mList;
    }

    public ArrayList binaryTreePath(TreeNode root, ArrayList arrayList, String s) {
        if (root == null) {
            return null;
        }
        s = s + root.val;
        if (root.right == null&& root.left==null) {
            arrayList.add( s);

        }
        binaryTreePath(root.left, arrayList, s);
        binaryTreePath(root.right, arrayList, s);
        return arrayList;
    }
}
