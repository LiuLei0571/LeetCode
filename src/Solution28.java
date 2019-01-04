public class Solution28 {
    public static void main(String[] args) {
        System.out.println(new Solution28().strStr("bbbacaa", "c"));
    }

//    public int strStr(String haystack, String needle) {
//        String[] str = haystack.split(needle);
//
//
//        if (haystack.equals(needle)||needle.equals("")||str.length==0) {
//            return 0;
//        }
//
//
//
//        return str[0].length() == haystack.length() ? -1 : str[0].length();
//    }


    public int strStr(String haystack, String needle) {
       return haystack.indexOf(needle);
    }
}
