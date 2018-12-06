import java.util.ArrayList;
import java.util.List;

/**
 * Created by liulei on 2018/12/5.
 */
public class Solution145 {
    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> mList = new ArrayList<>();
        postorderTraversal(root, mList);
        return mList;
    }

    public void postorderTraversal(TreeNode root, List<Integer> mList) {
        if (root == null) {
            return ;
        }
        postorderTraversal(root.left, mList);
        postorderTraversal(root.right, mList);
        mList.add(root.val);
    }
}
