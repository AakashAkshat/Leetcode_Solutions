public class CountSubArraysWithFixedBounds {
    class Solution {
        public long countSubarrays(int[] nums, int minK, int maxK) {
            int badB = -1;
            int minB = -1;
            int maxB = -1;
            long count = 0;

            for(int i=0; i<nums.length; i++) {
                if(nums[i] < minK || nums[i] > maxK) {
                    badB = i;
                }

                if(nums[i] == minK) {
                    minB = i;
                }

                if(nums[i] == maxK) {
                    maxB = i;
                }

                count += Math.max(0, (Math.min(minB, maxB) - badB));
            }

            return count;
        }
    }
}
