public class LengthOfLongestSubArrayWithAtMostKFrequency {
    class Solution {
        public int maxSubarrayLength(int[] nums, int k) {
            Map<Integer, Integer> count = new HashMap<>();
            int maxLength = 0;
            for (int start = 0, end = 0; end < nums.length; ++end) {
                count.put(nums[end], count.getOrDefault(nums[end], 0) + 1);
                while (count.get(nums[end]) > k) {
                    count.put(nums[start], count.get(nums[start]) - 1);
                    if (count.get(nums[start]) == 0) {
                        count.remove(nums[start]);
                    }
                    start++;
                }
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }
    }
}
