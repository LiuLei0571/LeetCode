import java.util.HashMap;
import java.util.HashSet;

public class Sword03 {
    public static void main(String[] args) {
        int[] test=new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(new Sword03().findRepeatNumber(test));
    }
    //哈希表
    public int findRepeatNumber(int[] nums) {
        int[] hash = new int[nums.length];

        for (int i = 0; i <nums.length ; i++) {
            if (hash[nums[i]]>0){
                return nums[i];
            }
            hash[nums[i]]++;
        }
        return -1;
    }
//    public int findRepeatNumber(int[] nums) {
//        HashSet<Integer> temp=new HashSet<>();
//         for (int i = 0; i <nums.length ; i++) {
//             if (temp.contains(nums[i])) {
//                 return  nums[i];
//             }else {
//                 temp.add(nums[i]);
//             }
//        }
//        return -1;
//    }
}
