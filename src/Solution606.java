public class Solution606 {
    public static void main(String[] args) {
        int[] a={5};
        TreeNode treeNode=new TreeNode(a);
        System.out.println(new Solution606().tree2str(treeNode.root));
    }

    public String tree2str(TreeNode t) {
        if (t == null) {
            return "" ;
        }
        StringBuilder stringBuilder = new StringBuilder();
        tree2str(t, stringBuilder);
        String result=stringBuilder.toString();
        result=result.substring(1,result.length()-1);
        return result;
    }

    private void tree2str(TreeNode t, StringBuilder stringBuilder) {
        if (t == null) {
            return;
        }
        stringBuilder.append("("+t.val);
        if (t.left == null && t.right!=null) {
            stringBuilder.append("()");

        }
        tree2str(t.left, stringBuilder);
        tree2str(t.right, stringBuilder);
        stringBuilder.append(")");

    }
}
