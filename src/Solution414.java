import java.util.HashSet;

/**
 * Created by liulei on 2019/1/9.
 */
public class Solution414 {
    public static void main(String[] args) {

        System.out.println(new Solution414().thirdMax(new int[]{2, 2, 3, 1}));

    }

//    public int thirdMax(int[] nums) {
//
//        long one = -Long.MAX_VALUE;
//        long two = -Long.MAX_VALUE;
//        long three = -Long.MAX_VALUE;
//        for (int num : nums) {
//            if (num > one) {
//                three = two;
//                two = one;
//                one = num;
//            } else if (num > two && num < one) {
//                three = two;
//                two = num;
//            } else if (num > three && num < two)
//                three = num;
//        }
//        if (three == -Long.MAX_VALUE) return (int) one;
//        else return (int) three;
//
//    }

    public int thirdMax(int[] nums) {

        HashSet<Integer> hashSet=new HashSet<>();
        for(int num:nums){
            hashSet.add(num);
        }
        int[] temp=new int[hashSet.size()];
        int i=0;
        for (int num:hashSet){
            temp[i++]=num;
        }
        if (temp.length<3){
            return temp[temp.length-1];
        }else {
            return temp[temp.length-3];
        }
    }
}
