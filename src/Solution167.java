public class Solution167 {
    public static void main(String[] args) {
        int a[]={2,3,4};
        int b[]=new Solution167().twoSum(a,6);
        System.out.println(b[0]+" "+b[1]);
    }
    public int[] twoSum(int[] numbers, int target) {
        int a[] = new int[2];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[i]+numbers[j]==target) {
                    a[0]=i+1;
                    a[1]=j+1;
                    break;
                }
            }
        }
        return a;
    }
}
