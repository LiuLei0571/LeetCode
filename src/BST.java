//二分搜索树具有可比较性,所以要继承Comparable
public class BST<T extends Comparable<T>> {
    public class Node {
        private T data;
        private Node left;
        private Node right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //根节点
    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T t) {
        root = add(root, t);

    }


    private Node add(Node node, T t) {
        if (node == null) {
            size++;
            return new Node(t);
        }
        if (t.compareTo(node.data) < 0) {
            node.left = add(node.left, t);

        } else if (t.compareTo(node.data) > 0) {
            node.right = add(node.right, t);
        }
        return node;
    }
    private void add1(Node node, T t) {
        if (node.data.equals(t)) {
            return;
        } else if (t.compareTo(node.data) < 0 && node.left == null) {
            node.left = new Node(t);
            size++;
            return;
        } else if (t.compareTo(node.data) > 0 && node.right == null) {
            node.right = new Node(t);
            size++;
            return;
        }
        if (t.compareTo(node.data) < 0) {
            add1(node.left, t);

        } else {
            add1(node.right, t);
        }
    }


    public T maxNum() {
        if (root == null) {
            return null;
        } else {
            return maxNum(root).data;

        }
    }

    private Node maxNum(Node root) {
        if (root.right == null) {
            return root;
        }
        return maxNum(root.right);
    }


    public T miniNum() {
        if (root == null) {
            return null;
        } else {
            return miniNum(root).data;

        }
    }

    private Node miniNum(Node root) {
        if (root.left == null) {
            return root;
        }
        return miniNum(root.left);
    }


    public T removeMini() {
        T ret = miniNum();
        root = removeMini(root);
        return ret;
    }

    private Node removeMini(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removeMini(node.left);
        return node;
    }


    public T removeMax() {
        T ret = miniNum();
        root = removeMax(root);
        return ret;
    }

    private Node removeMax(Node node) {
        if (node.right == null) {
            Node rightNode = node.left;
            node.left = null;
            size--;
            return rightNode;
        }
        node.right = removeMax(node.right);
        return node;
    }


    //查询
    public boolean contains(T t) {
        return contains(root, t);
    }

    private boolean contains(Node node, T t) {
        if (node.data.compareTo(t) == 0) {
            return true;
        } else if ((node.data.compareTo(t) < 0)) {
            return contains(node.left, t);
        } else {
            return contains(node.right, t);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void remove(T t) {
        root = remove(root, t);
    }

    private Node remove(Node node, T t) {
        if (node == null) {
            return null;
        }
        if (t.compareTo(node.data) < 0) {
            node.left = remove(node.right, t);
            return node;
        } else if (t.compareTo(node.data) > 0) {
            node = remove(node.left, t);
            return node;
        } else {
            //如果此节点是准备删除的元素。
            //待删除的节点左子树为空.
            if (node.left == null) {
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;
            }
            //带删除的节点右子树为空.
            if (node.right == null) {
                Node rightNode = node.left;
                node.left = null;
                size--;
                return rightNode;
            }
            //找到右子树的最小元素来替代当前的节点
            Node successRightMiniNode = miniNum(node.right);
            successRightMiniNode.right = removeMini(node.right);
            successRightMiniNode.left = node.left;
            node.left = null;
            node.right = null;
            return successRightMiniNode;

        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        generateBSTString(root, 0, stringBuilder);
        return stringBuilder.toString();
    }

    //生成以node节点，深度为depth深度的字符串
    private void generateBSTString(Node root, int depth, StringBuilder res) {
        if (root == null) {
            res.append(generateBSTString(depth) + "NULL\n");
            return;
        }
        res.append(generateBSTString(depth) + root.data + "\n");
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
