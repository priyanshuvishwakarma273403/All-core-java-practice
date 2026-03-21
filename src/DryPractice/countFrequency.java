package DryPractice;

public class countFrequency {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3,4,5,6,2};

        int n = arr.length;
        int arr1 [] = new int[n]; // to avoid counting duplicates

        for (int i = 0; i < n; i++) {
            int count = 1; // current element occurs at least once
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr1[i] = count;

                }
                else {
                    continue;
                }

            }
            System.out.println(arr1[i] + " ===> " + count+" Times" );
        }
    }
}

//        int count =0;
//        for(int i=0;i<arr.length;i++ ){
//            for(int j =0;j<arr.length;j++ ){
//                if(arr[i]!=arr[j]){
//                    System.out.println(arr[i]+" ");
//                    count++;
//                    j++;
//                }
//                System.out.print(count+" ");
//            }
//        }
//        for(int i=0;i<arr.length;i++ ){
//            for(int j=i+1;j<arr.length;j++ ){
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[j]+" ");
//                    count++;
//                    j++;
//                    i++;
//                }
//                System.out.print(count+" ");
//            }
//        }
//        System.out.println();
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }

