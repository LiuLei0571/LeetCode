import java.util.HashSet;

public class Solution217 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 1};
        System.out.println(new Solution217().containsDuplicate(a));
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (!hashSet.add(num)) {
                return true;
            }
        }
        return false;
    }
}
