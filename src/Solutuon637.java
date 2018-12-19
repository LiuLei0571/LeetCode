import java.util.*;

public class Solutuon637 {
    public static void main(String[] args) {
        int[] a = {2147483647,2147483647,2147483647};
        TreeNode treeNode = new TreeNode(a);
        System.out.println(new Solutuon637().averageOfLevels(treeNode.root).toString());
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add( sum / size);

        }
        return result;
    }
}
