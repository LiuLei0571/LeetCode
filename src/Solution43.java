public class Solution43 {
    public static void main(String[] args) {
        String s = new Solution43().multiply("63", "26");
        System.out.println(s);
    }
// 直接模拟乘法预算规则即可
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int n1 = num1.length();
        int n2 = num2.length();
        int[] result = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int d1 = num1.charAt(i) - '0';
                int d2 = num2.charAt(j) - '0';
                result[i + j + 1] += d1 * d2;
            }
        }
        int car = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            int temp = (result[i] + car) % 10;
            car = (result[i] + car) / 10;
            result[i] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int nun : result) {
            sb.append(nun);
        }
        while (sb.length()!=0&&sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()==0?"0":sb.toString();
    }
}
