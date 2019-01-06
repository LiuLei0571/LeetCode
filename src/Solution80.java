public class Solution80 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 2, 2, 3};
        int n = new Solution80().removeDuplicates(a);
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);

        }
    }

    public int removeDuplicates(int[] nums) {

        int index = 2;
        int len = nums.length;
        if (len < 3) return len;
        for (int i = 2; i < nums.length; i++) {
            if (nums[index - 2] != nums[i]) {
                nums[index] = nums[i];
                index++;

            }
        }
        return index;
    }
}
