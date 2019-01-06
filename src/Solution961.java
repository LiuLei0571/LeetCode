import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution961 {
    public static void main(String[] args) {
        int[] a=new int[]{1,3,3,3,2,2};
        System.out.println(new Solution961().repeatedNTimes(a));
    }
    public int repeatedNTimes(int[] A) {

        HashSet<Integer> hashSet=new HashSet<>();
        for (int a:A) {
            if (hashSet.contains(a)) {
                return a;
            }else {
                hashSet.add(a);
            }
        }
        return -1;
    }
//    public int repeatedNTimes(int[] A) {
//        int N = A.length / 2;
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < A.length; i++) {
//            if (map.containsKey(A[i])) {
//                map.put(A[i], map.get(A[i]) + 1);
//            } else {
//                map.put(A[i], 1);
//            }
//        }
//        int index=-1;
//        for (int key : map.keySet()) {
//            if (map.get(key) == N) {
//                index=key;
//                break;
//            }
//        }
//        return index;
//    }
}
