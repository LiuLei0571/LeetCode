public class Solution1071 {
    public static void main(String[] args) {
        System.out.println(
            new Solution1071().gcdOfStrings("ababab","abab")
        );
    }

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
    private int gcd(int a, int b) {
        return b == 0? a: gcd(b, a % b);
    }
}
