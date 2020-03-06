
public class Solution14 {
    public static void main(String[] args) {
        String[] test = new String[]{"flo111","flow","flight"};
        System.out.println(new Solution14().longestCommonPrefix(test));
    }
    //直接暴力解开即可
    public String longestCommonPrefix(String[] strs) {
        //横向比较法
        if( strs ==null|strs.length==0 ){
            return "";
        }
        String prefix = strs[0];
        for(int i =1;i<strs.length;i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
