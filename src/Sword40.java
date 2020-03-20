import java.util.Arrays;

/**
 * Created by liulei on 2020/3/20.
 */
public class Sword40 {
    public static void main(String[] args) {
        int[] test=new int[]{3,2,1};
        new Sword40().getLeastNumbers(test,2);
    }
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] result=new int[k];
        for (int i = 0; i <k ; i++) {
            result[i]=arr[i];
        }
        return result;
    }
}
