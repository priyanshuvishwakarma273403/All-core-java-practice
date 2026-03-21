package DSA_Leetcode;
// the question
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a
// different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
public class BuyAndSellStock {
    public static void main(String[] args) {
        //profit = selling price - buying price
//        int [] arr = {7,1,5,3,6,4}; // return profit
        //int [] arr = {7,6,4,3,1}; //return zero if no profit
        int [] arr = {15,3,8,9,10,4,5}; //alag alag element daal k check
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int ele : arr)
        {
            min = Math.min(min,ele);
            profit = Math.max(profit,ele-min);
        }
        System.out.println(profit+" ");
    }
}
