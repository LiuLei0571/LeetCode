public class Solution26 {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,3,4};
        System.out.println(new Solution26().removeDuplicates(a));
    }
    public int removeDuplicates(int[] nums) {
        int index=0;
        for (int i = 1; i < nums.length; i++) {
           if (nums[index]!=nums[i]){
               index++;
               nums[index]=nums[i];
           }
        }
        index++;
        return index;
    }
}
