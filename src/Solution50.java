//实现 pow(x, n) ，即计算 x 的 n 次幂函数,.此题的复杂度如果试O(n)的话，则无法通过，需要通过递归的方法，把复杂度控制在O(logN)。
public class Solution50 {
    public static void main(String[] args) {
        System.out.println(new Solution50().myPow(2, 5));
    }

    public double myPow(double x, int n) {
        //如果n为-2^31，那么此时取反的话由于n是int则不能表示成2^31
        if (n == Integer.MIN_VALUE) {
            return 1 / x * myPow(x, n + 1);

        }
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;

        }
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } else {
            return x * myPow(x * x, n / 2);
        }
    }
}
