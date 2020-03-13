import java.util.HashMap;

public class Solution169 {
    public static void main(String[] args) {
        int[] test = new int[]{2,1,1,1,2,3,3,3,3,3};
        System.out.println(new Solution169().majorityElement(test));
    }

    public int majorityElement(int[] nums) {
        int count = 0, result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                result = nums[i];
                count++;
            } else {
                result = nums[i] == result ? count++ : count--;
            }
        }
        return result;
    }


//    public int majorityElement(int[] nums) {
//        if (nums.length==1) {
//            return nums[0];
//        }
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        int count = nums.length;
//        int majority = count / 2;
//        for (int i = 0; i < count; i++) {
//            if (hashMap.containsKey(nums[i])) {
//                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
//                if (hashMap.get(nums[i]) > majority) {
//                    return nums[i];
//                }
//            } else {
//                hashMap.put(nums[i], 1);
//            }
//        }
//        return 0;
//    }
}
