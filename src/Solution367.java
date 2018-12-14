public class Solution367 {
    public static void main(String[] args) {
        System.out.println(new Solution367().isPerfectSquare(8));
    }

    public boolean isPerfectSquare(int num) {
        double a = Math.sqrt(num);

        return isIntegerForDouble(a);
    }

    public static boolean isIntegerForDouble(double obj) {
        double eps = 1e-10;  // 精度范围
        return obj - Math.floor(obj) < eps;
    }
}
