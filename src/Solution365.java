/**
 * Created by liulei on 2020/3/21.
 */
public class Solution365 {
    public static void main(String[] args) {
        System.out.println(new Solution365().canMeasureWater(3,4,5));

    }
    //裴蜀定理
   // 就是找 [公式] ，能否找到整数 [公式] 使得方程有解
    //有整数解时当且仅当 [公式] 是 [公式] 和 [公式] 的最大公约数 [公式] 的倍数。
    public boolean canMeasureWater(int x, int y, int z) {
        if (x+y<z){
            return false;
        }
        if (x == z || y == z || x + y == z){
            return true;
        }


        return z %gcd(x,y)==0;
    }
    private int gcd(int a, int b) {

        return b == 0? a: gcd(b, a % b);
    }
}
