package TaiyariDSA.hashMapPractice;

import java.util.HashMap;

public class Subset {
    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ele : a){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for(int ele : b){
            if(!map.containsKey(ele) || map.get(ele) == 0){
                System.out.println("Is not a subset");
                return;
            }
            map.put(ele, map.get(ele) - 1);
        }

        System.out.println("This is a subset");
    }
}