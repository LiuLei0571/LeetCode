import java.util.*;

public class Solution373 {
    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        int[] b = {1, 2, 3};
        System.out.println(new Solution373().kSmallestPairs(a, b, 2));
    }


    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<int[]> mList = new ArrayList<>();
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] + a[1] - b[0] - b[1];
            }
        });
        for (int a : nums1) {
            for (int b : nums2) {
                int[] nums = new int[2];
                nums[0] = a;
                nums[1] = b;
                priorityQueue.add(nums);
            }
        }
        while (k-- > 0 && priorityQueue.size() > 0) {
            int[] item = priorityQueue.poll();
            mList.add(item);
        }
        return mList;
    }
}
