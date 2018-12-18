public class Solution108 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        System.out.println(new Solution108().sortedArrayToBST(a));
    }
    public TreeNode sortedArrayToBST(int[] nums) {

        return add(0, nums.length - 1, nums);
    }

    private TreeNode add(int left, int right, int[] a) {
        if (left > right) {
            return null;
        }
        int mid = (right + left) / 2;
        TreeNode<Integer> treeNode = new TreeNode(a[mid]);
        treeNode.left = add(left, mid - 1, a);
        treeNode.right = add(mid+1, right, a);
        return treeNode;
    }
}
