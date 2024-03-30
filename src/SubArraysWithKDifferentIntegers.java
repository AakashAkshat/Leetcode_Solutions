public class SubArraysWithKDifferentIntegers {
    lass Solution {
        public int subarraysWithKDistinct(int[] nums, int k) {
            int ans = helper(nums, k) - helper(nums, k-1);

            return ans;
        }

        private int helper(int[] nums, int k) {
            int left = 0;
            int right = 0;
            int count = 0;

            Map<Integer, Integer> map = new HashMap<>();

            while (right < nums.length) {
                map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
                right++;

                while (map.size() > k) {
                    map.put(nums[left], map.get(nums[left]) - 1);
                    if (map.get(nums[left]) == 0) {
                        map.remove(nums[left]);
                    }
                    left++;
                }

                count += (right - left);
            }

            return count;
        }
    }
}
