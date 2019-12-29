import javax.swing.plaf.basic.ComboPopup;

public class Solution674 {
    public static void main(String[] args) {
        int[] n = new int[]{1,3,5,4,7};
        System.out.println(new Solution674().findLengthOfLCIS(n));
    }

    public int findLengthOfLCIS(int[] nums) {
        if (nums == null||nums.length==0) {
            return 0;
        }
        int result = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                result = Math.max(result, count);
                count = 1;
            }
        }
        return  Math.max(result, count);

    }
}
