import java.util.ArrayList;
import java.util.List;

//N叉树的后序遍历
public class Solution590 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        List<Integer> mList = new ArrayList<>();
        postorder(root, mList);
        return mList;
    }

    private void postorder(Node root, List<Integer> mList) {

        if (root == null) {
            return;
        }

        for (int i = 0; i < root.children.size(); i++) {
            postorder(root.children.get(i), mList);
        }
        mList.add(root.val);
    }
}
