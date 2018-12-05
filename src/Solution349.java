import java.util.ArrayList;
import java.util.TreeSet;

public class Solution349 {
    public static void main(String[] args) {

        int[] a = {1,2, 2, 3, 4};
        int[] b = {2, 3};
        System.out.println(new Solution349().intersection(a, b));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int index : nums1) {
            treeSet.add(index);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (treeSet.contains(nums2[i])) {
                list.add(nums2[i]);
                treeSet.remove(nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
