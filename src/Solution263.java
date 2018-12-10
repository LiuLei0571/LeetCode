import java.util.HashSet;

public class Solution263 {

    public static void main(String[] args) {
        System.out.println(new Solution263().isUgly(50000000));
    }

    public boolean isUgly(int num) {

        if (Math.abs(num) > Integer.MAX_VALUE) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        while (num >= 2 && num % 2 == 0) num /= 2;
        while (num >= 3 && num % 3 == 0) num /= 3;
        while (num >= 5 && num % 5 == 0) num /= 5;
        return num == 1;
    }
}
