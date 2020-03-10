/**
 * Created by liulei on 2020/3/9.
 */
public class Solution121 {
    public static void main(String[] args) {
        int[] test=new int[]{7,8,5,3,6,4};
        System.out.println(new Solution121().maxProfit(test));

    }
    public int maxProfit(int[] prices) {
        if (prices.length==0) {
            return 0;
        }
        int min=prices[0];
        int max=0;
        for (int i = 1; i <prices.length ; i++) {
            if (prices[i]<min){
                min=prices[i];
            }else {
                max=Math.max(max,prices[i]-min);
            }
        }
        return max;
    }
}
