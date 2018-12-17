import java.util.Stack;

public class Solution921 {
    public static void main(String[] args) {
        System.out.println(new Solution921().minAddToMakeValid("()))(("));
    }

    public int minAddToMakeValid(String S) {
        if (S == null || S.length() == 0) {
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();
        int count = chars.length;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
            } else if (chars[i] == ')') {
                if (!stack.isEmpty()) {
                    count -= 2;
                    stack.pop();
                }
            }
        }
        return count;
    }
}
