package CollectionQuestion;

import java.util.PriorityQueue;

class SortByWeight{
    public static class Pair{
        String item;
        int weight;
        public Pair(String item, int weight){
            this.item = item;
            this.weight = weight;
        }
    }
    public static String[] sort (String[] items,int[] weights){
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> Integer.compare(b.weight,a.weight));
        for(int i=0; i<items.length;i++){
            pq.add(new Pair(items[i],weights[i]));
        }
        String[] ans = new String[items.length];
        int idx =0;
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            ans[idx++]=p.item;
        }
        return ans;
    }
}

public class Practice3 {
    public static void main(String[] args) {
        String[] items = {"Laptop","Tv","Phone","Tablet"};
        int[] weights = {500,1000,5050,50};
        String[] ans = SortByWeight.sort(items,weights);
        for(String str:ans){
            System.out.println(str+" ");
        }
    }
}
