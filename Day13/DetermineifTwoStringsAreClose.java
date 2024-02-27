Question - https://leetcode.com/problems/determine-if-two-strings-are-close/description/?envType=study-plan-v2&envId=leetcode-75


class Solution {
    public boolean closeStrings(String word1, String word2) {

         int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char chr : word1.toCharArray()) {
            freq1[chr - 'a']++;
        }

        for (char chr : word2.toCharArray()) {
            freq2[chr - 'a']++;
        }

      for(int i =0 ; i < 26 ; i++){
             if(freq1[i] > 0 && freq2[i] == 0 ){
                 return false;
             } else if(freq2[i] > 0 && freq1[i]== 0){
                 return false;
             }
        }
         Arrays.sort(freq1);
        Arrays.sort(freq2);

   for(int i = 0; i < 26 ; i++){
        if(freq1[i] != freq2[i]){
            return false;
        }
    }
        return true;
    }
    
}
