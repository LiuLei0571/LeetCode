import com.sun.org.apache.bcel.internal.generic.FADD;

import java.util.ArrayList;
import java.util.List;

public class Solution821 {
    public static void main(String[] args) {
        System.out.println(new Solution821().shortestToChar("abb", 'a'));
    }

    public int[] shortestToChar(String S, char C) {
        char[] charArray = S.toCharArray();
        int[] mList = new int[charArray.length];

        for (int i = 0, j = 0; i < charArray.length; i++) {
            if (charArray[i] == C) {
                mList[j++] = i;
            }
        }
        int[] result = new int[charArray.length];

        int slow = 0;
        int temp = 0;
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == C) {
                temp = 0;
                slow++;

            } else {
                if (slow > 0) {
                    temp = Math.min(Math.abs(i - mList[slow]), Math.abs(mList[slow - 1] - i));
                } else {
                    temp = Math.abs(i - mList[slow]);
                }
            }
            result[i] = temp;

        }

        return result;
    }
}
