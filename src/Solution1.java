import java.util.HashMap;

public class Solution1 {
    public static void main(String[] args) {
        int[] a = {3, 3};
        System.out.println(new Solution1().twoSum(a, 6));
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
