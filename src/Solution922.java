public class Solution922 {
    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 5, 7};
        System.out.println(new Solution922().sortArrayByParityII(a));
    }
//    public int[] sortArrayByParityII(int[] A) {
//
//        int[] a=new int[A.length/2];
//        int[] b=new int[A.length/2];
//        for (int i = 0,j=0,k=0; i <A.length ; i++) {
//            if (A[i]%2==0){
//                a[j]=A[i];
//                j++;
//            }else {
//                b[k]=A[i];
//                k++;
//            }
//        }
//        for (int i = 0,j=0,k=0; i <A.length ; i++) {
//            if (i%2==0){
//                A[i]=a[j];
//                j++;
//            }else {
//                A[i]=b[k];
//                k++;
//            }
//        }
//
//        return A;
//    }


    public int[] sortArrayByParityII(int[] A) {

        int[] a = new int[A.length];
        int i = 0;
        int j = 1;
        for (int num : A) {

            if (num % 2 == 0) {
                a[i]=num;
                i+=2;
            } else {
                a[j]=num;
                j+=2;
            }
        }

        return a;
    }
}
