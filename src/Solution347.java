import java.util.*;

//给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
public class Solution347 {
    public static void main(String[] args) {
        int[] a = {4, 1, -1, 2, -1, 2, 3};
        System.out.println(new Solution347().topKFrequent(a, 2));
    }

    private class Freq implements Comparable<Freq> {
        int e, freq;

        public Freq(int e, int freq) {
            this.e = e;
            this.freq = freq;
        }

        @Override
        public int compareTo(Freq other) {
            if (this.freq - other.freq < 0) {
                return -1;
            } else if (this.freq - other.freq > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }


    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> mList = new ArrayList<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap();
        for (int num : nums) {
            if (treeMap.containsKey(num)) {
                treeMap.put(num, treeMap.get(num) + 1);
            } else {
                treeMap.put(num, 1);
            }
        }
        //最小堆
//        PriorityQueue<Freq> priorityQueue = new PriorityQueue<>(new FreqCompare());
        PriorityQueue<Freq> priorityQueue = new PriorityQueue<>();

        for (int key : treeMap.keySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(new Freq(key, treeMap.get(key)));
            } else {
                if (treeMap.get(key) > priorityQueue.peek().freq) {
                    priorityQueue.poll();
                    priorityQueue.add(new Freq(key, treeMap.get(key)));
                }
            }
        }
        while (!priorityQueue.isEmpty()) {
            mList.add(priorityQueue.poll().e);
        }
        return mList;
    }
}
