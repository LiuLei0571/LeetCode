import java.util.ArrayList;

//给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
//
//返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
//
//如果 S[i] == "I"，那么 A[i] < A[i+1]
//如果 S[i] == "D"，那么 A[i] > A[i+1]
// 所以第一个I一定是最小的值0。之后的数值是0+=1，第一个D一定是最大值N-=1，返回的数组的大小是S.length+1;
public class Solution942 {
    public static void main(String[] args) {
        System.out.println(new Solution942().diStringMatch("IDID").toString());
    }

    public int[] diStringMatch(String S) {
        int n = S.length();
        int a = 0;
        int[] result = new int[S.length()+1];

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                result[i] = a++;
            }
            if (S.charAt(i) == 'D') {
                result[i]=n--;
            }
        }
        result[S.length()]=a;
        return result;
    }
}

