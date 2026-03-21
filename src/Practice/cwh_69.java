package Practice;

public class cwh_69 {
    static void main(String[] args) {
        int [] arr ={32,0,86,0,23,34,0,76,0};
        int i =0;
       for(int ele : arr) {
           System.out.println(ele+" ");
       }
       for(int j =0;j<arr.length;j++){
           if(arr[j]==0)
               j++;
           else {
               int temp=arr[j];
               arr[j]=arr[j-1];
               arr[j-1]=temp;
               i++;
               j++;
           }

        }
while(i<arr.length){
    arr[i++]=0;
    for(int n:arr){
        System.out.print(n+" ");
    }
}

    }
}
