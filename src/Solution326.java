public class Solution326 {
    public static void main(String[] args) {
        System.out.println(new Solution326().isPowerOfThree(3));
    }

    public boolean isPowerOfThree(int n) {

        return (n>0) && ((n&(n-1)) == 0);
    }
}
