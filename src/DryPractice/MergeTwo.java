package DryPractice;

public class MergeTwo {
    public static void main(String[] args) {
        int [] arr = {1,3,4,6,7,9};
        int [] arr2 = {2,5,8,10};
      int [] c = new int [arr.length+arr2.length];
      for(int ele : c)
      {
          System.out.print(ele+" ");
      }
        System.out.println();
      merge(c,arr,arr2);
      for(int ele : c)
          {
          System.out.print(ele+" ");
          }
        System.out.println();
    }
    public static void merge(int [] c,int [] arr,int [] arr2){
        int i=0,j=0,k=0;
        while(i<arr.length && j<arr2.length){
            if(arr[i]<arr2[j]) {
                    c[k]=arr[i];
                    i++;
                    k++;
            }
            else {
                c[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr.length){
            c[k]=arr[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            c[k]=arr2[j];
            k++;
            j++;
        }
    }
}
