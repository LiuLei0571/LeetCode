import java.util.HashSet;
import java.util.Set;

/**
 * Created by liulei on 2018/12/8.
 */

//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//示例 1:
//
//        输入: "abcabcbb"
//        输出: 3
//        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//        示例 2:
//
//        输入: "bbbbb"
//        输出: 1
//        解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//        示例 3:
//
//        输入: "pwwkew"
//        输出: 3
//        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//        请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
public class Solution3 {

    public static void main(String[] args) {
        System.out.println( new Solution3().lengthOfLongestSubstring("abcbdw"));

    }
    // 定义两个指针，start和end，代表当前窗口的开始和结束位置，
    // 使用hashset,当窗口中出现重复的字符时，start++;没有重复时，end++,每次更新长度的最大值
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int res=0;
        int end=0,start=0;
        Set<Character> set=new HashSet<>();
        while (start<n&&end<n){
            if (set.contains(s.charAt(end))){
                set.remove(s.charAt(start++));
            }else {
                set.add(s.charAt(end++));
                res=Math.max(res,end-start);
            }
        }
        return res;
    }
}
