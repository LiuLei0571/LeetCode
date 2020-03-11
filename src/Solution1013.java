public class Solution1013 {
    public static void main(String[] args) {
        int[] test=new int[]{10,-10,10,-10,10,-10,10,-10,10,-10};
        System.out.println(new Solution1013().canThreePartsEqualSum(test));
    }

    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int a : A) {
            sum = sum + a;
        }
        if (sum % 3 != 0) {
            return false;
        }

        int ave = sum / 3;
        int temp = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            temp += A[i];
            if (count==3){
                return true;
            }
            if (temp == ave) {
                count++;
                temp = 0;
            }
        }
        if (count == 3) {
            return true;
        }
        return false;
    }
}
