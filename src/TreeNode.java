public class TreeNode<T extends Comparable<T>> {
    int val;
    TreeNode left;
    TreeNode right;


    int a[];
    TreeNode root;

    public TreeNode(int[] a) {
        this.val = a[0];
        for (int i = 0; i < a.length; i++) {
            root = add(root, a[i]);
        }
    }

    int size = 0;

    public TreeNode(Integer t) {
        val = t;
    }

    private TreeNode add(TreeNode node, Integer t) {
        if (node == null) {
            size++;
            return new TreeNode(t);
        }
        if (t.compareTo(node.val) < 0) {
            node.left = add(node.left, t);

        } else if (t.compareTo(node.val) > 0) {
            node.right = add(node.right, t);
        }
        return node;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        generateBSTString(root, 0, stringBuilder);
        return stringBuilder.toString();
    }

    //生成以node节点，深度为depth深度的字符串
    private void generateBSTString(TreeNode root, int depth, StringBuilder res) {
        if (root == null) {
            res.append(generateBSTString(depth) + "NULL\n");
            return;
        }
        res.append(generateBSTString(depth) + root.val + "\n");
        generateBSTString(root.left, depth + 1, res);
        generateBSTString(root.right, depth + 1, res);

    }

    private String generateBSTString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");

        }
        return res.toString();
    }
}
