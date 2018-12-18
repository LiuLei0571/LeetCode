public class Solution461 {
    public int hammingDistance(int x, int y) {
        //异或操作，算出1的个数。
        return Integer.bitCount(x ^ y);
    }
}
