import java.util.HashMap;
import java.util.Map;

/**
 * Created by liulei on 2020/3/20.
 */
public class Solution409 {
    public static void main(String[] args) {
        System.out.println(new Solution409().longestPalindrome("aaabb"));
    }
    public int longestPalindrome(String s) {

        Map<Character, Integer> hasmap = new HashMap<>();
        int result=0;
        for (int i = 0; i < s.length(); i++) {
            if (hasmap.containsKey(s.charAt(i))) {
                int temp=hasmap.get(s.charAt(i));
                hasmap.put(s.charAt(i),++temp );

            } else {
                hasmap.put(s.charAt(i), 1);
            }
        }
        if (hasmap.size()==1) {
            return s.length();
        }
        boolean hasOne=false;
        for (Map.Entry<Character, Integer> entry:hasmap.entrySet()){
            int temp =entry.getValue();
            if (temp%2==0) {
                result+=temp;
            }else {
                hasOne=true;
                result+=temp-1;
            }

        }

        return hasOne?++result:result;
    }

}
