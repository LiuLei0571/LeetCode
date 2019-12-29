public class Solution33 {
    public static void main(String[] args) {
        int[] a=new int[]{6,7,8,9,0,1,2,5};
        System.out.println(new Solution33().search(a,3));
    }
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[left]) {
                if (target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] <= nums[right]) {
                if (target > nums[right] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        return -1;
    }
}
