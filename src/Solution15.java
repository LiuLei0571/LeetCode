import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution15 {
    public static void main(String[] args) {
        int[] s=new int[]{-2,1,1,5,-1,0};
        System.out.println(new Solution15().threeSum(s));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k = j+1; k <n ; k++) {
                    if (nums[i]+nums[k]+nums[j]==0){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        result.add(temp);
                    }
                }
            }
        }
        HashSet set = new HashSet(result);
        result.clear();
        result.addAll(set);
        return result;
    }
}
