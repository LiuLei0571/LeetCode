import java.util.HashMap;

public class Solution1 {
    public static void main(String[] args) {
        int[] a = {5,7,8,2,4};
        int[] b=new Solution1().twoSum(a, 6);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
     }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashSet = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashSet.put(nums[i], i);
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.containsKey(target - nums[i]) && i != hashSet.get(target - nums[i])) {
                result[1] = i;
                result[0] = hashSet.get(target - nums[i]);
            }
        }
        return result;
    }
}
