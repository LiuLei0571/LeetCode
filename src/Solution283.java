public class Solution283 {
    public static void main(String[] args) {
        int[] a={0,3,4,0,5};
        new Solution283().moveZeroes(a);
    }
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        nums.toString();
    }
}
