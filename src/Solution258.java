/**
 * Created by liulei on 2018/12/13.
 *
 */
//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。

//其实结果就是num%9,如果事件复杂度为O(1)的话，基本上是存在规律的。
public class Solution258 {
    public static void main(String[] args) {
        System.out.println(new Solution258().addDigits(39));
    }
    public int addDigits(int num) {
        int temp=0;
        if (num<10){
            return num;
        }
        while (num>0){
            temp+=num%10;
            num=num/10;
        }
        return addDigits(temp);
    }
}
