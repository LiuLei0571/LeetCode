import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//给定一个二叉搜索树的根结点 root, 返回树中任意两节点的差的最小值。
public class Solution783 {
    public static void main(String[] args) {
        int[] a={4,2,6,1,3};
        System.out.println(new Solution783().minDiffInBST(new TreeNode(a).root));
    }

    public int minDiffInBST(TreeNode root) {

        List<Integer> mList = new ArrayList<>();
        minDiffInBST(root, mList);
        int count = mList.get(1) - mList.get(0);
        for (int i = 2; i < mList.size(); i++) {
            count = mList.get(i) - mList.get(i - 1) <= count ? mList.get(i) - mList.get(i - 1) : count;
        }
        return count;
    }

    private void minDiffInBST(TreeNode root, List<Integer> mList) {
        if (root == null) {
            return;
        }
        minDiffInBST(root.left, mList);
        mList.add(root.val);
        minDiffInBST(root.right, mList);
    }
}
