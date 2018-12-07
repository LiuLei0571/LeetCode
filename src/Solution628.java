import com.sun.org.apache.regexp.internal.RE;

import java.util.*;

public class Solution628 {
    public static void main(String[] args) {
        int[] a = {-4, -3, -2, -1, 60};
        System.out.println(new Solution628().maximumProduct(a));
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (nums[len - 1] < 0)
            return nums[len - 1] * nums[len - 2] * nums[len - 3];
        //存在从负数开始的情况
        int a = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int b = nums[len - 1] * nums[0] * nums[1];
        return a > b ? a : b;
    }
}
