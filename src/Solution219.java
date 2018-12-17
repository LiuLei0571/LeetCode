import java.util.HashMap;

public class Solution219 {
    public static void main(String[] args) {
        int[] a = {99, 99};
        System.out.println(new Solution219().containsNearbyDuplicate(a, 1));
    }
    //最大为 k 的意思是 <=k 就可以了。
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                if (i - map.get(nums[i]) <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
