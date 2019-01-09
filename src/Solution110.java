/**
 * Created by liulei on 2019/1/8.
 */
public class Solution110 {
    public static void main(String[] args) {
        int[] a=new int[]{5,4,7,6,8};
        TreeNode<Integer> treeNode=new TreeNode<Integer>(a);
        System.out.println(new Solution110().isBalanced(treeNode.root)+"");
    }

    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }
        int balancetor = getHeight(root.left) - getHeight(root.right);
        if (Math.abs(balancetor) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);

        }
    }

    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}
