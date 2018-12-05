public class Solution905 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(new Solution905().sortArrayByParity(a).toString());
    }

    public int[] sortArrayByParity(int[] A) {
        int[] newA = new int[A.length];
        for (int i = 0, j = 0, z = A.length - 1; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                newA[j] = A[i];
                j++;
            } else {
                newA[z] = A[i];
                z--;
            }
        }
        return newA;
    }
}
