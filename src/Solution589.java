import java.util.ArrayList;
import java.util.List;

//N叉树的前序遍历
public class Solution589 {
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


    public List<Integer> preorder(Node root) {

        List<Integer> mList = new ArrayList<>();
        preorder(root, mList);

        return mList;
    }

    private void preorder(Node root, List<Integer> mList) {

        if (root == null) {
            return;
        }
        mList.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i), mList);
        }
    }
}
