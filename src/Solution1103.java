public class Solution1103 {

    public static void main(String[] args) {
        System.out.println(new Solution1103().distributeCandies(10,3).toString());
    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] result=new int[num_people];
        int temp=0;
        while (candies>0){
            result[temp%num_people]+=Math.min(temp+1,candies);
            temp++;
            candies=candies-temp;

        }
        return result;
    }
}
