// Question: https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/


class Solution {
      public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count the frequency of each number in the array
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find numbers that appear exactly twice
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 2) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}