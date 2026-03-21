package CollectionQuestion;

import java.util.HashMap;
import java.util.Map;

public class FindFrequency {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,3};
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);

        }
        System.out.println(map);
    }
}
