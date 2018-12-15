public class Solution832 {
    public static void main(String[] args) {
        int[][] a = {{1, 1, 0}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(new Solution832().flipAndInvertImage(a));
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length / 2; j++) {
                int temp = 0;
                temp = A[i][j];
                A[i][j] = A[i][A[i].length - j-1];
                A[i][A[i].length - j-1] = temp;
            }
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = 1 - A[i][j];
            }
        }
        return A;
    }
}
