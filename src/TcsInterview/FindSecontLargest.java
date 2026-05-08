package TcsInterview;

public class FindSecontLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele > first){
               second = first;
               first = ele;
            }else if(ele > second && ele != first){
                second = ele;
            }
        }
        System.out.println(second);
        System.out.println(first);
    }
}
