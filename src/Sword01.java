public class Sword01 {
    public static void main(String[] args) {
        System.out.println(new Sword01().compressString(""));
    }

    public String compressString(String S) {
        if (S == null||S.equals("")) {
            return "";
        }
        int count = 0;
        char c = S.charAt(0);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (c == S.charAt(i)) {
                count++;
            } else {
                result.append(c).append(count);
                count = 1;
                c = S.charAt(i);
            }
        }
        String temp = result.append(S.charAt(S.length() - 1)).append(count).toString();
        if (temp.length()>=S.length()) {
            return S;
        }else {
            return result.toString();

        }
    }
}
