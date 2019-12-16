public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }else{
            int sum=0;
            int a=0;
            a=x;
            while(a!=0){
                sum=sum*10+a%10;
                a=a/10;
            }
            if (sum==x) {
                return  true;
            }
            return  false;
        }
    }
}
