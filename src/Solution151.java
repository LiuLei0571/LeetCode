public class Solution151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(new Solution151().reverseWords(s));
    }

    public String reverseWords(String s) {
        s = s.trim();
        String[] temp = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = temp.length-1; i >=0 ; i--) {
            if (!temp[i].equals("")){
                result.append(temp[i]+" ");

            }
        }
        return result.toString().trim();
    }
}
