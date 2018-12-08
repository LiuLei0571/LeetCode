/**
 * Created by liulei on 2018/12/8.
 */
public class Solution581 {
    public static void main(String[] args) {
        int[] a = {1,4,2,2,7};
        System.out.println(new Solution581().findUnsortedSubarray(a));
    }

    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        int max = nums[0];
        int min = nums[length - 1];
        int star = 0;
        int end = 0;
        for (int i = 1; i < length; i++) {
            //取最大值与当前值比较，如果最大值大于这个值，说明此处是一个需要更换的地方。当前位置一定是已经遍历到的最大值位置
            max = Math.max(max, nums[i]);
            if (max > nums[i]) {
                end = i;
            }
            //反向确认需要开始的位置，当前位置一定是已经遍历的最小值
            min = Math.min(min, nums[length - i - 1]);
            if (min < nums[length - 1 - i]) {
                star = length - i - 1;
            }
        }

        if (end == 0 && star == 0) {
            return 0;
        }
        return end - star + 1;
    }
}
