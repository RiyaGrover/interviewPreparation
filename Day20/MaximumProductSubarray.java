// Question - https://www.geeksforgeeks.org/maximum-product-subarray/

//https://leetcode.com/problems/maximum-product-subarray/description/


class Solution {
    public int maxProduct(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        // Initialize variables to keep track of the maximum product
        int maxProduct = arr[0];
        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                // When the current element is negative, swap max and min
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            // Update the max and min product ending at the current position
            maxEndingHere = Math.max(arr[i], maxEndingHere * arr[i]);
            minEndingHere = Math.min(arr[i], minEndingHere * arr[i]);

            // Update the overall maximum product
            maxProduct = Math.max(maxProduct, maxEndingHere);
        }

        return maxProduct;
    }
}



Another Soluionn--class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            prefix *= arr[i];
            suffix *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(prefix, suffix));
            
            // Reset prefix and suffix to the value of current element if they become zero
            if (prefix == 0) {
                prefix = arr[i];
            }
            if (suffix == 0) {
                suffix = arr[n - i - 1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 10, 10, 10, 10, 10, 10, 10, 10, 10, -10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 0};
        System.out.printf("Maximum Subarray product is %d%n", sol.maxProduct(arr));
    }
}
