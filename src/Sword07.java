import java.util.HashMap;

public class Sword07 {

    public static void main(String[] args) {

    }
    private HashMap<Integer, Integer> hashMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }

        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int preorderStart, int preorderEnd, int[] inorder, int inorderStart, int inorderEnd) {
        if (preorderStart > preorderEnd) {
            return null;
        }
        int rootVal = preorder[preorderStart];
        TreeNode treeNode = new TreeNode(rootVal);
        if (preorderStart == preorderEnd) {
            return treeNode;
        } else {
            int rootIndex = hashMap.get(rootVal);
            int leftVal = rootIndex - inorderStart;
            int rightVal = inorderEnd - rootIndex;
            TreeNode leftNode = buildTree(preorder, preorderStart + 1, preorderStart + leftVal, inorder, inorderStart, rootIndex - 1);
            TreeNode rightNode = buildTree(preorder, preorderEnd - rightVal + 1, preorderEnd, inorder, rootIndex + 1, inorderEnd);
            treeNode.left = leftNode;
            treeNode.right = rightNode;
        }
        return treeNode;
    }
}
