public class Solution507 {
    public static void main(String[] args) {
        System.out.println(new Solution507().checkPerfectNumber(100));
    }
    public boolean checkPerfectNumber(int num) {
       int sum=1;
       int n= (int) Math.sqrt(num);//有一半的因子是在平方根中
        for (int i = 2; i <= n; i++) {
            if (num%i== 0) {
                sum=sum+i+(num/i);
            }
        }

      return sum==num;
    }
}
