package Practice;
public class cwh_33 {
    public static void main(String[] args) {
        String[] arr ={"Abhinav","Naman","Naman","Raghav","Raghav","Vishesh","Anurag"};
        for(int i=0;i<arr.length-1;i++)
        {
          for(int j=i+1;j>i;j++)
          {
              if(arr[i]==arr[j]&&(i!=j))
              {
                  System.out.println(arr[j]);
              }
          }
        }
    }
}
