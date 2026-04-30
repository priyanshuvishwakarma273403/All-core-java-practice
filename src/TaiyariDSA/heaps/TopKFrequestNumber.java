package TaiyariDSA.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int ele ;
    int freq ;
    Pair(int ele,int freq){
        this.ele=ele;
        this.freq=freq;
    }

    @Override
    public int compareTo(Pair p) {
        if(this.freq == p.freq) return this.ele-p.ele;
        return this.freq-p.freq;
    }
}

public class TopKFrequestNumber {
    public static void main(String[] args) {
        int [] arr = {3, 1, 4, 4, 5, 2, 6, 1};
        int k = 2;
        System.out.println( topKFreq(arr,k));
    }

    private static ArrayList<Integer> topKFreq(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele,freq));
            if(pq.size()>k) pq.poll();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(pq.size()>0){
            Pair top = pq.poll();
            ans.add(top.ele);
        }
        Collections.reverse(ans);
        return ans;
    }
}
