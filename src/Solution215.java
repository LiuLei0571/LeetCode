import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

//在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
//输入: [3,2,1,5,6,4] 和 k = 2
//输出: 5
//输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
//输出: 4
public class Solution215 {
    public static void main(String[] args) {
        int[] a = {3,2,3,1,2,4,5,5,6};
        System.out.println(new Solution215().findKthLargest(a, 4));
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        for (int key : nums) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(key);
            } else {
                if (key > priorityQueue.peek()) {
                    priorityQueue.remove();
                    priorityQueue.add(key);
                }
            }
        }
        return priorityQueue.poll();
    }
}
