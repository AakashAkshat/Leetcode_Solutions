public class SubArrayProductLessThanK {
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if(k <= 1)
                return 0;

            int start = 0;
            int end = 0;
            int prod = 1;
            int count = 0;

            while(end < nums.length) {
                prod *= nums[end];

                while(start < nums.length && prod >= k) {
                    prod = prod / nums[start];
                    start++;
                }

                if(prod < k) {
                    count += end-start+1;
                    end++;
                }
            }

            return count;
        }
    }
}
