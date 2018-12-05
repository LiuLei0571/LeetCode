import java.util.TreeSet;

public class Solution136 {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 1, 2};
        System.out.println(new Solution136().singleNumber(a));
    }

    public int singleNumber(int[] nums) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!treeSet.contains(nums[i])) {
                treeSet.add(nums[i]);
            } else {
                treeSet.remove(nums[i]);
            }
        }
        return treeSet.first();

    }
}
