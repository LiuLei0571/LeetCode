/**
 * Created by liulei on 2019/1/8.
 */
public class Solution27 {

    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 2, 3};
        System.out.println(new Solution27().removeElement(a, 3));
    }

    //把要删除都挪到后面
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int len = nums.length;
        for (int i = 0; i < len-index; i++) {
            if (nums[i] == val) {
                index++;
                nums[i]=nums[len -index] ;
                i--;
            }
        }
        return len-index;
    }
}
