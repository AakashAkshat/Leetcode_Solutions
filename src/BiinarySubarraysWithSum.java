public class BiinarySubarraysWithSum {
    class Solution {
        public int numSubarraysWithSum(int[] nums, int goal) {
            int[] count = new int[nums.length+1];
            count[0] = 1;
            int ans = 0;
            int sum = 0;

            for(int digit : nums) {
                sum += digit;

                if(sum - goal >= 0) {
                    ans += count[sum - goal];
                }

                count[sum]++;
            }

            return ans;
        }
    }
}
