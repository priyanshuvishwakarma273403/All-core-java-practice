package TaiyariDSA.array;

//   time complexity  O(n*n)
//    space  O(1)

public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,8};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {

        int maxProfit = 0;
        for(int i = 0; i < prices.length-1; i++){
            for(int j = i+1; j < prices.length; j++){
                int profit = prices[j] -  prices[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
