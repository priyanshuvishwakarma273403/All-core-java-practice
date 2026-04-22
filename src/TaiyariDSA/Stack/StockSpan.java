package TaiyariDSA.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {100, 80, 90, 120};
        System.out.println(calculateSpan(arr));
    }

    private static ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        int[] span = new int[n];
        span[0] = 1;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i = 1; i < n; i++){
            while(st.size() > 0 && arr[st.peek()] < arr[i]) st.pop();
            if(st.size() == 0) span[i] = i-(-1);
            else span[i] = i -  st.peek();
            st.push(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ans.add(span[i]);
        }
        return ans;
    }
}


//The stock span problem is a financial problem where we have a series
//of daily price quotes for a stock and we need to calculate the span of stock price for all days.
//You are given an array arr[] representing daily stock prices, the stock span
//        for the i-th day is the number of consecutive days up to day i (including day i itself)
//    for which the price of the stock is less than or equal to the price on day i.
//Return the span of stock prices for each day in the given sequence.
//
//Examples:
//
//Input: arr[] = [100, 80, 90, 120]
//Output: [1, 1, 2, 4]
//Explanation: Traversing the given input span 100 is greater than
//equal to 100 and there are no more days behind it so the span is 1, 80 is
//greater than equal to 80 and smaller than 100 so the span is 1, 90 is greater than equal
//        to 90 and 80 so the span is 2, 120 is greater than 90, 80 and 100 so the span is 4.
//So the output will be [1, 1, 2, 4].