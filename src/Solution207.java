import java.util.ArrayList;
import java.util.List;

public class Solution207 {

    public static void main(String[] args) {
//        int[][] e={{1,2},{2,3},{3,1},{3,7}};
        int[][] e={{1,0},{0,1},{1,2}};
        System.out.println(new Solution207().canFinish(4,e)+"");
    }

    public  boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graphic = new List[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graphic[i] = new ArrayList<>();
        }
        for (int[] pre : prerequisites) {
            graphic[pre[0]].add(pre[1]);
        }
        boolean[] globalMarked = new boolean[numCourses];
        boolean[] localMarked = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(globalMarked, localMarked, graphic, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(boolean[] globalMarked, boolean[] localMarked,
                             List<Integer>[] graphic, int curNode) {

        if (localMarked[curNode]) {
            return true;
        }
        if (globalMarked[curNode]) {
            return false;
        }
        globalMarked[curNode] = true;
        localMarked[curNode] = true;
        for (int nextNode : graphic[curNode]) {
            if (hasCycle(globalMarked, localMarked, graphic, nextNode)) {
                return true;
            }
        }
        localMarked[curNode] = false;
        return false;
    }
}
