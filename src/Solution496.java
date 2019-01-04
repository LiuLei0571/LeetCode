import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //把num2中的右边第一个大于它的元素都存在map里面,key代表num2的坑，value代表下一个更大数字，然后取map的值就好，而num1的数字正好对应里面map的key
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;

    }
}
