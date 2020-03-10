/**
 * Created by liulei on 2020/3/10.
 */
public class Solution543 {
    int res = 0;

    public static void main(String[] args) {
        int[] test=new int[]{1,2,3,4,5};
        TreeNode treeNode=new TreeNode(test);
        System.out.println(new Solution543().depth(treeNode));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        depth(root);
        return res;
    }
    public int depth(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left=depth(root.left);
        int right=depth(root.right);
        res=Math.max(res,left+right);
        return Math.max(left,right)+1;
    }
}
