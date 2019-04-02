class Solution{
	public int maxProfit(int[] prices){
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		for(int i = 0; i < prices.length; i++){
			if(prices[i] < minPrice){
				minPrice = prices[i];
			}else if(prices[i+1] - minPrice > maxProfit){
				maxProfit = prices[i+1] - prices[i];
			}
			return maxProfit;
		}
	}
}

//Time complexity: O(n) only a single pass is needed
//Space complexity: O(1) Only two variables are used