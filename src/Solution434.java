public class Solution434 {
    public static void main(String[] args) {
        System.out.println(new Solution434().countSegments("a"));
    }

    public int countSegments(String s) {

        if (s == null || s.length() == 0 || s.trim().length() == 0) {
            return 0;
        }
        int count = 1;
        String str = s.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
     return count;
    }
}
