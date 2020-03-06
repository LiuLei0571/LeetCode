public class Sword04 {
    public static void main(String[] args) {
        int[][] test = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(new Sword04().findNumberIn2DArray(test, 20));
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix==null||matrix.length==0) {
            return  false;
        }
        int column = matrix[0].length - 1;
        int temp = 0;
        while (column>=0&&temp<matrix.length){
            if (target < matrix[temp][column]) {
                column--;
            } else if (target == matrix[temp][column]) {
                return true;
            } else {
                temp++;
            }
        }

        return false;
    }
}
