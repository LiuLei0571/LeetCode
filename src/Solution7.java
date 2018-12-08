/**
 * 整数反转
 * Created by liulei on 2018/12/8.
 */

public class Solution7 {
    public static void main(String[] args) {
        System.out.println(new Solution7().reverse(-123));
    }

    public int reverse(int x) {


        long temp=0;
        while (x!=0){
            temp=temp*10+x%10;
            x=x/10;
        }
       return temp>Integer.MAX_VALUE||temp<Integer.MIN_VALUE?0: (int) temp;
    }
}
