public class Solution344 {
    public static void main(String[] args) {
        System.out.println(new Solution344().reverseString("abc"));
    }

    public String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int n=s.length(),a = s.length()-1;
        for (int i = n; i > 0; i--) {
            stringBuilder.append(s.charAt(a--));
        }
        return stringBuilder.toString();
    }
}
