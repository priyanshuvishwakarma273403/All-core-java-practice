package TaiyariDSA.heaps;

import java.util.Arrays;

class Heap{
    private int[] arr;
    private int idx = 1;
    int peek(){
        if(size() == 0){
            System.out.println("Heap is empty !");
            return -1;
        }
        return arr[1];
    }

    void add(int ele){
        if(idx == arr.length){
            System.out.println("Heap is Full");
            return;
        }

        arr[idx++] = ele;
        int root = idx-1;
        while(root!=1){
            int parent = root/2;
            if(arr[root]<arr[parent]){
                int temp = arr[root];
                arr[root] = arr[parent];
                arr[parent] = temp;
                root = parent;
            }
            else break;
        }
    }

    void display(){
        for(int i = 0; i<idx; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    int size(){
        return idx-1;
    }

    Heap(int capacity){
        arr = new int[capacity+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
    }
}

public class MinHeapImplementation {
    public static void main(String[] args) {
        Heap h = new Heap(10);
        h.add(10); h.add(15); h.add(8); h.add(9); h.add(4);
        h.display();

    }
}
