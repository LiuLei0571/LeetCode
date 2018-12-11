public class Solution231 {
    public static void main(String[] args) {
        System.out.println(new Solution231().isPowerOfTwo(218));
    }

    public boolean isPowerOfTwo(int n) {
        if(n < 1) return false;
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }
}

