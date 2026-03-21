package Practice;

public class cwh_16 {
    public static boolean check(int num [] ,int item)
    {
        for(int ele :num)
        {
            if(item==ele)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr ={332,53,434,65,78,655,234,78,5,76};
        System.out.println(check(arr,6));
        System.out.println(check(arr,434));
    }
}
