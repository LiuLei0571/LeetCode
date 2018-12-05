public class Solution226 {

    public static void main(String[] args) {
        int[] a = {5, 2, 3, 1, 7, 6, 8};
        TreeNode treeNode = new TreeNode(a);
        System.out.println(new Solution226().invertTree(treeNode.root).toString());
    }

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }
        if (!(root.right == null && root.left == null)) {
            TreeNode node = root.right;
            root.right = invertTree(root.left);
            root.left = invertTree(node);
        }
        return root;
    }
}
