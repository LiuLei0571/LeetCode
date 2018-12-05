import java.util.TreeSet;

public class Solution804 {
    public static void main(String[] args) {
        String[] a={"gin", "zen", "gig", "msg"};
        System.out.println(new Solution804().uniqueMorseRepresentations(a));
    }
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        TreeSet<String> treeSet = new TreeSet<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                result.append(codes[word.charAt(j) - 'a']);
            }
            treeSet.add(result.toString());
        }
        return treeSet.size();
    }
}
