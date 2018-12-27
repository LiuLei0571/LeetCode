import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> rootList1 = new ArrayList<>();
        depthOrderTraversal(root1, rootList1);
        List<Integer> rootList2 = new ArrayList<>();
        depthOrderTraversal(root2, rootList2);
       return rootList1.equals(rootList2);

    }

    private void depthOrderTraversal(TreeNode root, List<Integer> mList) {

        if (root != null) {
            if (root.left == null && root.right == null) {
                mList.add(root.val);
            }
            depthOrderTraversal(root.left, mList);
            depthOrderTraversal(root.right, mList);
        }


    }

}
