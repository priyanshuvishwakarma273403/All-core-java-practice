package TaiyariDSA.array;

import java.util.HashSet;

public class FIndDuplicateUsingSets {
    public static void main(String[] args) {
        int [] arr = {13,3,4,2,2};
        print(arr);
    }

    private static void print(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
           if(set.contains(ele)){
               System.out.println("Duplicate element : " +ele);
               return;
           }
            set.add(ele);
        }
        System.out.println("No duplicates found");
    }
}
