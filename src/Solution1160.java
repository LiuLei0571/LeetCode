import java.util.HashMap;
import java.util.Map;

public class Solution1160 {
    public static void main(String[] args) {
        String[] words=new String[]{"hello","world","leetcode"};
        System.out.println(new Solution1160().countCharacters(words,"welldonehoneyr"));
    }
    public int countCharacters(String[] words, String chars) {
        HashMap charHasMap = getConut(chars);
        int result = 0;

        for (int i = 0; i < words.length; i++) {
            HashMap<Character, Integer> wordMap = getConut(words[i]);
            int temp= words[i].length();
            for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
                if (!charHasMap.containsKey(entry.getKey())) {
                    temp=0;
                    break;
                } else {
                    int count1 = (int) charHasMap.get(entry.getKey());
                    int count2 = entry.getValue();
                    if (count2 > count1) {
                        temp=0;
                        break;
                    }
                }
            }
            result +=temp;
        }


        return result;
    }

    private HashMap<Character, Integer> getConut(String word) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int j = 0; j < word.length(); j++) {
            char temp = word.charAt(j);
            if (hashMap.containsKey(temp)) {
                int cout = hashMap.get(temp);
                hashMap.put(temp, ++cout);
            } else {
                hashMap.put(temp, 1);
            }
        }
        return hashMap;
    }
}
