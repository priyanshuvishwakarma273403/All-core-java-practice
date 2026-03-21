package com.ArrayQuestion;

public class SequenceElement {
    public static void main(String[] args) {
        int element;
        int [] arr = {1,2,3,4,5,6,8,9,10};
         element=9;
        int formula =element*((element+1)/2);
        int sum =0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println(formula-sum);
    }
}

