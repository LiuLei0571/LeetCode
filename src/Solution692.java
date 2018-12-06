import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

//输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
//输出: ["i", "love"]
//解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
//    注意，按字母顺序 "i" 在 "love" 之前。
public class Solution692 {
    public static void main(String[] args) {
        String[] a = { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        System.out.println(new Solution692().topKFrequent(a, 4));
    }

    private class Freq implements Comparable<Freq> {
        String e;
        int freq;

        public Freq(String e, int freq) {
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
                return other.e.compareTo(this.e);
            }
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String, Integer> treeMap = new TreeMap();
        for (String num : words) {
            if (treeMap.containsKey(num)) {
                treeMap.put(num, treeMap.get(num) + 1);
            } else {
                treeMap.put(num, 1);
            }
        }
        //最小堆
//        PriorityQueue<Freq> priorityQueue = new PriorityQueue<>(new FreqCompare());
        PriorityQueue<Freq> priorityQueue = new PriorityQueue<>();

        for (String key : treeMap.keySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(new Freq(key, treeMap.get(key)));
            } else {
                if (treeMap.get(key) > priorityQueue.peek().freq) {
                    priorityQueue.poll();
                    priorityQueue.add(new Freq(key, treeMap.get(key)));
                }
            }
        }
        List<String> mList = new ArrayList<>();

        while (!priorityQueue.isEmpty()){
            mList.add(priorityQueue.poll().e);
        }
        for (int i = 0; i <mList.size()/2 ; i++) {
            String s=mList.get(i);
            mList.set(i,mList.get(mList.size()-1-i));
            mList.set(mList.size()-1-i,s);
        }
        return mList;
    }
}
