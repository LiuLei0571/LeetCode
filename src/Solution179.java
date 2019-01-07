import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by liulei on 2019/1/7.
 */
public class Solution179 {
    public static void main(String[] args) {
        int[] a = new int[]{3,30,34,5,9};
        System.out.println(new Solution179().largestNumber(a));
    }

    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0) return "";

        String[] strings=new String[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            strings[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {

                s1 = s1 + s2;
                s2=s2+s1;
                return s2.compareTo(s1);
            }
        });
        if(strings[0].charAt(0) == '0') return "0";

        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            result.append(string);
        }
        return result.toString();
    }


}
