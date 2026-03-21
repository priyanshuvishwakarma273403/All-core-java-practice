package Practice;

public class cwh_93 {
    static void main() {
        int [] arr = {32,45,65,765,54};
        int max =Integer.MIN_VALUE;
        int smax =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
      for(int j=0;j<arr.length;j++) {
          if(arr[j]>smax&&arr[j]!=max) {
              smax=arr[j];

          }
      }
        System.out.println(max);
        System.out.println(smax);

    }

}
