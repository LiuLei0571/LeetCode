import java.util.ArrayList;
import java.util.List;
//给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。
//根据二叉搜索树中序遍历是递增的规则
public class Solution530 {
    public static void main(String[] args) {
        int[] a={100,76,35,86,97,11,90};
        TreeNode treeNode=new TreeNode(a);
        System.out.println(new Solution530().getMinimumDifference(treeNode.root));
    }

    public int getMinimumDifference(TreeNode root) {
        List<Integer> mList = new ArrayList<>();
        getMinimumDifference(root, mList);
        int min = mList.get(1) - mList.get(0);
        for (int i = 1; i < mList.size(); i++) {
            min = Math.min(min, mList.get(i) - mList.get(i - 1));
        }
        return min;
    }

    private void getMinimumDifference(TreeNode root, List<Integer> mList) {
        if (root == null) {
            return;
        }
        getMinimumDifference(root.left, mList);
        mList.add(root.val);
        getMinimumDifference(root.right, mList);
    }
}
