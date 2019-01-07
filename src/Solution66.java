/**
 * Created by liulei on 2019/1/7.
 */
public class Solution66 {
    public static void main(String[] args) {
        int[] a = new int[]{9};
        System.out.println(new Solution66().plusOne(a).toString());
    }

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return null;
        }
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i > 0; i--) {

            if (digits[i] >= 10) {
                digits[i - 1] += 1;
                digits[i] = 0;
            }
        }
        if (digits[0] > 9) {
            digits[0] = 1;
            int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 0, digits.length);
            result[digits.length] = 0;
            return result;
        }

        return digits;
    }
}
