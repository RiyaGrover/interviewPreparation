Question - https://leetcode.com/problems/equal-row-and-column-pairs/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
       HashMap<String, Integer> hashMap = new HashMap<>();

       for(int [] row : grid){
           String rowStr = Arrays.toString(row);

           hashMap.put(rowStr , hashMap.getOrDefault(rowStr, 0) +1);
       }

       int count = 0;
       for(int i = 0 ; i < n ; i++){
           int col[] = new int [n];
           for(int j = 0; j < n;j++){
               col[j] = grid[j][i];
           }
           count += hashMap.getOrDefault(Arrays.toString(col), 0);
       }
       return count;
}
}