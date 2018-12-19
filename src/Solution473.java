public class Solution473 {
    public static void main(String[] args) {
        int[] a={3,3,3,3,4};
        System.out.println(new Solution473().makesquare(a));
    }
    public boolean makesquare(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
        }
        if (count % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
