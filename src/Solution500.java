import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution500 {
    public static void main(String[] args) {
//        String[] strings = {"Hello", "Alaska", "Dad", "Peace"};
        String[] strings = {"a", "b"};

        System.out.println(new Solution500().findWords(strings));
    }

    public String[] findWords(String[] words) {
        List<String> results = new ArrayList<String>();
        char[] row1 = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] row2 = new char[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] row3 = new char[]{'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++)
            hashMap.put(row1[i], 1);
        for (int i = 0; i < 9; i++)
            hashMap.put(row2[i], 2);
        for (int i = 0; i < 7; i++)
            hashMap.put(row3[i], 3);

        for (int i = 0; i < words.length; i++) {

            char[] chars = words[i].toLowerCase().toCharArray();
            int flag = hashMap.get(chars[0]);
            int temp = flag;
            for (int j = 1; j < chars.length; j++) {
                if (flag != hashMap.get(chars[j])) {
                    flag = hashMap.get(chars[j]);
                    break;
                }
            }
            if (temp == flag) {
                results.add(words[i]);
            }

        }
        String[] strings = new String[results.size()];
        for (int i = 0; i < results.size(); i++) {
            strings[i] = results.get(i);
        }
        return strings;
    }
}
