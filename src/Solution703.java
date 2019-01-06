import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution703 {

    public static void main(String[] args) {
        int[] a = new int[]{0};
        KthLargest kthLargest = new KthLargest(3, a);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }

    static class KthLargest {
        int size;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        public KthLargest(int k, int[] nums) {
            this.size = k;
            for (int key : nums) {
                if (priorityQueue.size() < size) {
                    priorityQueue.add(key);
                } else {
                    if (key > priorityQueue.peek()) {
                        priorityQueue.remove();
                        priorityQueue.add(key);
                    }
                }
            }
        }

        public int add(int val) {
            if (priorityQueue.size() < size) {
                priorityQueue.add(val);
            } else {
                if (val > priorityQueue.peek()) {
                    priorityQueue.remove();
                    priorityQueue.add(val);
                }
            }
            return priorityQueue.peek();
        }
    }
}
