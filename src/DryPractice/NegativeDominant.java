package DryPractice;

public class NegativeDominant {
    public static void main(String[] args) {
        int [] arr ={-1,2,34,-5,-43,54,64};
        int negative = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
              negative++;
            }
        }
        System.out.println("The array have negative elements "+negative);
    }
}
