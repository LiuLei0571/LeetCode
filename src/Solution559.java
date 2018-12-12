
import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//N叉树的最大深度
public class Solution559 {
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

    public int maxDepth(Node root) {

        int max=0;
        if (root == null) {
            return 0;
        }
        for (int i = 0; i < root.children.size(); i++) {
            int temp = maxDepth(root.children.get(i));
            max=Math.max(temp,max);
        }
        return max+1;
    }
//    public int maxDepth(Node root) {
//        if (root == null) {
//            return 0;
//        }
//        Queue<Node> arrayQueue = new LinkedList<Node>();
//
//        arrayQueue.offer(root);
//        int maxDepth = 0;
//        while (!arrayQueue.isEmpty()) {
//            maxDepth++;
//            int size = arrayQueue.size();
//            for (int i = 0; i < size; i++) {
//                List<Node> curr = arrayQueue.poll().children;
//                for (int j = 0; j < curr.size(); j++) {
//                    arrayQueue.offer(curr.get(j));
//                }
//            }
//
//        }
//        return maxDepth;
//    }
}
