import java.util.ArrayList;
import java.util.List;

public class Solution46 {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4};
        System.out.println(new Solution46().permute(a));
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        backtrack(nums, l, result);

        return result;
    }

    public void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size()==nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i])) {
                    continue;
                }
                temp.add(nums[i]);
                backtrack(nums,temp,result);
                temp.remove(temp.size()-1);
            }
        }
    }
}
