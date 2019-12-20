import java.util.ArrayDeque;

public class Solution71 {
    public static void main(String[] args) {
        String s = "/../";
        System.out.println(new Solution71().simplifyPath(s));
    }

    public String simplifyPath(String path) {
        String[] s = path.trim().split("/");
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("..")) {
                if (arrayDeque.size() > 0) {
                    arrayDeque.removeLast();

                }
            } else if (s[i].equals(".")) {
                continue;
            } else if (!s[i].equals("")) {
                arrayDeque.addLast(s[i]);
            }
        }
        if (arrayDeque.size() == 0) {
            return "/";
        }
        StringBuilder result = new StringBuilder();
        for (String s1 : arrayDeque) {
            result.append("/" + s1);
        }
        return result.toString();
    }
}
