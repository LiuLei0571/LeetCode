public class Solution35 {
    public static void main(String[] args) {
        int[] result = new int[]{1, 5,6,7,8};
        System.out.println(new Solution35().searchInsert(result, 4));
    }
    //二分法查找即可，时间复杂度为 log2n
    public int searchInsert(int[] nums, int target) {

        if (nums.length == 0)//数组为空时直接返回0；
        {
            return 0;
        }

        if (target > nums[nums.length-1])//如果所给数字大于最后的数字直接返回为长度；
        {
            return nums.length;
        }
        if (target < nums[0])//如果所给数字小于第一个直接返回0；
        {
            return 0;
        }

        int low = 0;
        int high = nums.length - 1;
        int middle = 0;
        while (low <= high) {
            middle = (low + high) / 2;
            if (nums[middle] > target) {
                high = middle - 1;
            } else if (nums[middle] < target) {
                low = middle+1;
            } else {
                return middle;
            }

        }
        if (low>high&& target!=nums[low]){
            if (target>nums[high]) {
                return high+1;
            }else {
                return high;
            }
        }
        return 0;
    }
}
