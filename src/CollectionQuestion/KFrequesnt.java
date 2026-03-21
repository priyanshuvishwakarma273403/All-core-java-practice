package CollectionQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KFrequesnt {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);

                }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));

        for(int j:map.keySet()){
            pq.add(j);
            if(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println(pq);
    }
}
