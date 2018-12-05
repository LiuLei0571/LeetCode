public class Solution771 {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAAb";
        System.out.println(new Solution771().numJewelsInStones(J, S) + "");
    }

    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        for (int i = 0; i < J.length(); i++)
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    sum++;
                }
            }
        return sum;
    }
}
