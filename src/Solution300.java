import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.zip.CheckedOutputStream;

public class Solution300 {
    public static void main(String[] args) {
        int[] test=new int[]{10,9,2,5,3,7,101,18};
        System.out.println(new Solution300().lengthOfLIS(test));
    }
    public int lengthOfLIS(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int count = 0;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp >= nums[i]) {
                temp = nums[i];
                count = 0;
            } else {
                count++;
            }
        }
        return count;
    }
}
