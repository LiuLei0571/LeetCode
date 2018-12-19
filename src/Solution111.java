public class Solution111 {
    public static void main(String[] args) {
        int[] a={5,4,10,9,11};
        TreeNode treeNode=new TreeNode(a);
        System.out.println(new Solution111().minDepth(treeNode.root));
    }
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        return 1 + Math.min(l, r);
    }

    public int minDepth(TreeNode root, int index) {

        if (root.left == null && root.right == null) {
            return 1;
        }
        index++;

        return 0;
    }
}
