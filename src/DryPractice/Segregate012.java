package DryPractice;

public class Segregate012 {
    public static void main(String[] args) {
        int [] arr ={0,1,0,1,2,0,2,0,1,0};
        int numberofzero=0;
        int numberofones=0;
        int numbertwo=0;
        for(int ele : arr){
            if(ele==0){
                numberofzero++;
            }
            else if(ele==1)  {
                numberofones++;
            }
            else {
                numbertwo++;
            }
        }
        System.out.println(numberofzero);
        System.out.println(numberofones);
        System.out.println(numbertwo);

        for(int i=0;i<numberofzero;i++) {
            arr[i] = 0;
        }
        for(int i=numberofzero;i<numberofzero+numbertwo;i++) {
            arr[i] = 2;
        }
        for(int i=numberofzero+numbertwo;i<arr.length;i++) {
            arr[i] = 1;
        }

        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}
