package TaiyariDSA.array;



public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        int k = 0;  // this is using for loop
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j = 0; j < k; j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                arr[k]=arr[i];
                k++;
            }
        }

        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }

//        HashSet<Integer> set = new HashSet<>();
//        for(int ele : arr){
//            set.add(ele);
//        }
//        System.out.println(set);
    }
}
