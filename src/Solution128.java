import java.util.HashMap;

public class Solution128 {
    public static void main(String[] args) {
        int[] a=new int[]{100,2,1,3,4};
        System.out.println(new Solution128().longestConsecutive(a));
    }

    public int longestConsecutive(int[] nums) {
        if (nums == null||nums.length==0) {
            return 0;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.getOrDefault(nums[i], 0) == 0) {
                //相邻左边数字的最大序列
                int left = hashMap.getOrDefault(nums[i] - 1, 0);
                //相邻右边数字的最大序列
                int right = hashMap.getOrDefault(nums[i] + 1, 0);
                int length = left + right + 1;
                hashMap.put(nums[i], length);
                if (left != 0) {
                    hashMap.put(nums[i] - left, length);
                }
                if (right != 0) {
                    hashMap.put(nums[i] + right, length);
                }
                max = Math.max(max, length);
            }
        }
        return max;
    }
}
