import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution13 {
    public static void main(String[] args) {
        System.out.println(new Solution13().romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int temp = 0;
        HashMap<Character, Integer> hashSet = new HashMap<>();
        hashSet.put('I', 1);
        hashSet.put('V', 5);
        hashSet.put('X', 10);
        hashSet.put('L', 50);
        hashSet.put('C', 100);
        hashSet.put('D', 500);
        hashSet.put('M', 1000);
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            int value = hashSet.get(chars[i]);

            if (temp > value) {
                count -= value;
            } else {
                count += value;
            }
            temp = value;
        }
        return count;
    }
}
