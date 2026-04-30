package TaiyariDSA.heaps;

import java.util.ArrayList;

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
        topKFreq(arr,k);
    }

    private static ArrayList<Integer> topKFreq(int[] arr, int k) {


    }
}
