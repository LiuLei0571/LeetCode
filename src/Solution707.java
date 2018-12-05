public class Solution707 {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
//        obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        System.out.println(obj.toString());
        obj.get(1);
        System.out.println(obj.toString());
        obj.get(1);
        System.out.println(obj.toString());
        obj.deleteAtIndex(1);
        System.out.println(obj.toString());

        //        obj.deleteAtIndex(1);
//        obj.get(1);
    }

    static class MyLinkedList {
        private class Node {
            private int data;
            private Node next;

            public Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }

            public Node() {
                this(0, null);
            }

            public Node(int data) {
                this(data, null);
            }

            @Override
            public String toString() {
                return super.toString();
            }

        }

        //建立唯一的虚拟头节点
        private Node duumyHead;
        private int size;

        /**
         * Initialize your data structure here.
         */
        public MyLinkedList() {
            duumyHead = new Node(0, null);
            size = 0;
        }

        /**
         * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
         */
        public int get(int index) {
            Node cur = duumyHead.next;
            if (cur == null) {
                return 0;
            }
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }

            return cur.data;
        }

        public int getSize() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        /**
         * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
         */
        public void addAtHead(int val) {
            addAtIndex(0, val);

        }

        /**
         * Append a node of value val to the last element of the linked list.
         */
        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        /**
         * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
         */
        public void addAtIndex(int index, int val) {
            Node pre = duumyHead;
            Node node = new Node(val);
            //找到插入之前的那个节点
            for (int i = 0; i < index; i++) {
                pre = pre.next;
            }
            node.next = pre.next;
            pre.next = node;

            size++;
        }

        /**
         * Delete the index-th node in the linked list, if the index is valid.
         */
        public void deleteAtIndex(int index) {
            Node pre = duumyHead;
            for (int i = 0; i < index; i++) {
                pre = pre.next;
            }
            Node node = pre.next;
            pre.next = node.next;
            node.next = null;
            size--;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            Node cur = duumyHead.next;
            while (cur != null) {
                stringBuilder.append(cur.data + " -> ");
                cur = cur.next;
            }
            stringBuilder.append("NULL");

            return stringBuilder.toString();
        }
    }

}
