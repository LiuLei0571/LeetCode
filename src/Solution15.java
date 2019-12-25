import java.util.*;

public class Solution15 {
    public static void main(String[] args) {
        int[] s = new int[]{-2, 1, 1, 5, -1, 0,1};
        System.out.println(new Solution15().threeSum(s));
    }

    //    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result=new ArrayList<>();
//        int n=nums.length;
//        for (int i = 0; i <n ; i++) {
//            for (int j = i+1; j <n ; j++) {
//                for (int k = j+1; k <n ; k++) {
//                    if (nums[i]+nums[k]+nums[j]==0){
//                        List<Integer> temp=new ArrayList<>();
//                        temp.add(nums[i]);
//                        temp.add(nums[j]);
//                        temp.add(nums[k]);
//                        result.add(temp);
//                    }
//                }
//            }
//        }
//        HashSet set = new HashSet(result);
//        result.clear();
//        result.addAll(set);
//        return result;
//    }
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        if (nums[0]==0&&nums[nums.length-1]==0){
            result.add(Arrays.asList(0,0,0));
            return result;
        }
        HashMap<Integer, Integer> hashMAp = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (hashMAp.containsKey(0-nums[i]-nums[j])){
                    result.add(Arrays.asList(nums[i],nums[j],0-nums[i]-nums[j]));
                }
            }
            hashMAp.put(nums[i],i);
        }
        HashSet hashSet=new HashSet(result);
        result.clear();
        result.addAll(hashSet);
        return result;
    }
}
