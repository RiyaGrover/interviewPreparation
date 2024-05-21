// Question - https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/
// Java code for the above approach

// Time Complexity: O(N). Where N is the size of prices array. 
// Auxiliary Space: O(1)



class Main {
	static int maxProfit(int prices[], int n)
	{
		int buy = prices[0];
         int max_profit = 0;
		for (int i = 1; i < n; i++) {

			// Checking for lower buy value
			if (buy > prices[i])
				buy = prices[i];

			// Checking for higher profit
			else if (prices[i] - buy > max_profit)
				max_profit = prices[i] - buy;
		}
		return max_profit;
	}

	// Driver Code
	public static void main(String args[])
	{
		int prices[] = { 7, 1, 5, 6, 4 };
		int n = prices.length;
		int max_profit = maxProfit(prices, n);
		System.out.println(max_profit);
	}
}

// This code is contributed by Lovely Jain
