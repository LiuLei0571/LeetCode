import java.util.ArrayList;
import java.util.TreeMap;

public class Solution350 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(new Solution350().intersect(nums1, nums2));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int num : nums1) {
            if (!treeMap.containsKey(num)) {
                treeMap.put(num, 1);
            } else {
                treeMap.put(num, treeMap.get(num) + 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums2) {
            if (treeMap.containsKey(num)) {
                list.add(num);
                treeMap.put(num, treeMap.get(num) - 1);
                if (treeMap.get(num) == 0) {
                    treeMap.remove(num);
                }
            }
        }
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
