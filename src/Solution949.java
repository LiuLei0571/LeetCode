import java.util.Arrays;

/**
 * Created by liulei on 2018/12/13.
 */
public class Solution949 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(new Solution949().largestTimeFromDigits(a));
    }

    public String largestTimeFromDigits(int[] A) {
        StringBuilder str = new StringBuilder();

        Arrays.sort(A);

        if (A[3]<=4)
        if (A[0] * 10 + A[1] > 24) {
            return "";
        } else if (A[1] * 10 + A[0] > 24) {
            str.append(A[0]+"" + A[3]);
        } else if (A[0] * 10 + A[1] < 24) {
            str.append(A[0] +""+ A[1]);
        }

        return str.toString();
    }
}
