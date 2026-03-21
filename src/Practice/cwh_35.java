package Practice;

public class cwh_35 {
    public static void main(String[] args) {
        String [] arr ={"Raghav","Vinay","Satyam","Mohit","Achyut"};
        String [] arr1={"Satyam","karan","vaibhav","mohit","Raghav"};
        int delete=2;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr[i].equals(arr1[j]))
                {
                    System.out.println(delete);
                    j--;
                }

            }
        }
    }
}