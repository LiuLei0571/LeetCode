public class Solution441 {
    public static void main(String[] args) {
        System.out.println(new Solution441().arrangeCoins(1));
    }

    public int arrangeCoins(int n) {
//        int temp=0;
//        for (int i = 1; i <= n; i++) {
//            temp+=i;
//            if (n-temp<=i){
//                return i;
//            }
//        }
//        return 0;

        int count = 0;
        int k = 1;
        while (n > 0) {
            n -= k;
            if (n >= 0) {
                count++;
            }
            k++;
        }
        return count;
    }
}
